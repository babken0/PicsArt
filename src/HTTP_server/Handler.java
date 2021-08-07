package HTTP_server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Handler implements Callable<Void> {
    private static final Map<String,String> CONTENT_TYPES = new HashMap<String, String>(){{
        put("jpg","image/jpeg");
        put("html","text/html");
        put("json","application/json");
        put("txt","text/plain");
        put("","text/html");
    }};
    public static final String NOT_FOUND_MESSAGE = "NOT FOUND";

    private Socket socket;
    private String directory;

    Handler(Socket socket, String directory){
        this.socket = socket;
        this.directory = directory;
    }

    @Override
    public Void call() throws Exception {
        try (InputStream inputStream = this.socket.getInputStream(); final OutputStream outputStream = this.socket.getOutputStream()) {
            String url = this.getRequestUrl(inputStream);
            Path filePath = Paths.get(this.directory, url);
            if (Files.exists(filePath) && !Files.isDirectory(filePath)){
                final String extension = this.getFileExtension(filePath);
                final String type = CONTENT_TYPES.get(extension);
                final byte[] fileBytes = Files.readAllBytes(filePath);
                this.sendHeader(outputStream,200,"OK",type,fileBytes.length);
                outputStream.write(fileBytes);

            }else{
                final String type = CONTENT_TYPES.get("text");
                this.sendHeader(outputStream,404,NOT_FOUND_MESSAGE,type,NOT_FOUND_MESSAGE.length());
                outputStream.write(NOT_FOUND_MESSAGE.getBytes(StandardCharsets.UTF_8));
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
        return null;
    }

    private String getFileExtension(Path path){
        String name = path.getFileName().toString();
        int extensionStart = name.lastIndexOf('.');
        return extensionStart == -1 ? "" :name.substring(extensionStart+1);
    }

    private String getRequestUrl(InputStream inputStream){
        Scanner reader = new Scanner(inputStream).useDelimiter("\r\n");
        String line = reader.next();
        return line.split(" ")[1];
    }

    private void sendHeader(OutputStream outputStream, int statusCode,String statusText,String type,long length){
        PrintStream ps = new PrintStream(outputStream);
        ps.printf("HTTP/1.1 %s %s%n",statusCode,statusText);
        ps.printf("Content-Type",type);
        ps.printf("Content-Length: %s%n%n",length);
    }
}
