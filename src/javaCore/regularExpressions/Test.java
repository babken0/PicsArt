package javaCore.regularExpressions;

import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean isActive = true;
        System.out.println(UserService.isEmailValid("babkenboya@gmail.com"));
        while (isActive){
            System.out.println("Registration: 1");
            System.out.println("Login: 2");
            int k = scanner.nextInt();
            if (k==1){
                UserService.createUser();
            }
            else if(k==2) {
                UserService.login();
            }
            else{
                System.out.println("Input 1 or 2");
            }
        }
    }
}
