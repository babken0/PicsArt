package HTTP_server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyServer {
    private int port;
    private String directory;

    public MyServer(int port, String directory) {
        this.port = port;
        this.directory = directory;
    }

    public static void main(String[] args) {
        int port = Integer.parseInt(args[0]);
        String directory = args[1];
        new MyServer(port,directory).start();
    }

    void start(){
        ExecutorService pool = Executors.newFixedThreadPool(50);
        try (ServerSocket server = new ServerSocket(this.port)){
            while (true){
                Socket socket = server.accept();
                Callable<Void> task = new Handler(socket,this.directory);
                pool.submit(task);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
