package javaAdvanced.GUI_Timer;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.setVisible(true);
        timer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        timer.setSize(300,250);
        timer.setResizable(false);
        timer.setLocationRelativeTo(null);

    }
}
