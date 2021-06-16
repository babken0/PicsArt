package javaAdvanced.timer;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new TimerRunnable(1,15));
        thread.start();
    }
}
