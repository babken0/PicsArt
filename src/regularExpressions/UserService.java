package regularExpressions;

import inheritance.service.FileService;

import javax.jws.soap.SOAPBinding;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserService {

    private static final String USER_PATH= "C:\\Users\\babke\\IdeaProjects\\PicsArt\\src\\regularExpressions\\database.txt";
    public static void createUser() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input full name");
        String fullName = scanner.nextLine();

        System.out.println("Input username");
        String username = scanner.next();
        boolean isUsernameValid = isUsernameValid(username);
        while (!isUsernameValid){
            System.out.println("Input valid username");
            isUsernameValid = isUsernameValid(scanner.next());
        }

        System.out.println("Input Email address");
        String email = scanner.next();
        boolean isEmailValid = isEmailValid(email);
        while (!isEmailValid){
            System.out.println("Input valid email");
            isEmailValid = isEmailValid(scanner.next());
        }

        System.out.println("Input password");
        String password = scanner.next();
        boolean isPasswordValid = isPasswordValid(password);
        while (!isPasswordValid){
            System.out.println("Input valid password");
            isPasswordValid = isPasswordValid(scanner.next());
        }
        writeUser(new User(fullName,username,email,password));

    }

     private static boolean isUsernameValid(String username) throws IOException {
        String REGEX = "^.{10,}$";
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(username);
        for (User user : readUser()){
            if (user.getUsername().equals(username)){
                System.out.println("Input other username");
                return false;
            }
        }
        return matcher.matches();
    }
    public static boolean isEmailValid(String email){
        String REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private static boolean isPasswordValid(String password){
        String REGEX = "^(?=.*[A-Z].*[A-Z])(?=.*[0-9].*[0-9].*[0-9]).{8,}$";
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    private static String MD5(String md5) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(md5.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : array) {
                sb.append(Integer.toHexString((b & 0xFF) | 0x100), 1, 3);
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException ignored) {
        }
        return null;
    }

    private static void writeUser(User user) throws IOException {
        if (!Files.exists(Paths.get(USER_PATH)))
            Files.createFile(Paths.get(USER_PATH));
        String userString = new StringBuilder().append(user.getFullName())
                .append(",")
                .append(user.getUsername())
                .append(",")
                .append(user.getEmail())
                .append(",")
                .append(MD5(user.getPassword()))
                .toString();
        Files.write(Paths.get(USER_PATH),userString.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
    }

    private static List<User> readUser() throws IOException {
        List<User> users = new ArrayList<>();
        if (!Files.exists(Paths.get(USER_PATH)))
            Files.createFile(Paths.get(USER_PATH));
        List<String> list = Files.readAllLines(Paths.get(USER_PATH));
        for (String userString :list){
            String[] userArray = userString.split(",");
            User user = new User(userArray[0],userArray[1],userArray[2],userArray[3]);
            users.add(user);
        }
        return users;
    }

    public static void login() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input username");
        String username = scanner.next();
        System.out.println("Input password");
        String password  = scanner.next();
        for (User user : readUser()){
            if (user.getUsername().equals(username) &&user.getPassword().equals(MD5(password))){
                System.out.println("Login success");
                break;
            }
        }
        System.out.println("invalid input data");
    }
}
