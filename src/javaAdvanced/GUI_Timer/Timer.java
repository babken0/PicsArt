package javaAdvanced.GUI_Timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Timer extends JFrame {
    JButton start,reset;
    JLabel l1,l2,m,s;
    JTextField t1,t2;
    Handler handler = new Handler();
    volatile boolean isRun = true;


    public Timer(){
        super("Timer");
        start = new JButton("Start");
        reset = new JButton("reset");
        l1 = new JLabel("min:");
        l2 = new JLabel("sec:");
        m = new JLabel("");
        s = new JLabel("");
        t1 = new JTextField(3);
        t2 = new JTextField(2);
        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        m.setFont(new Font("Serif", Font.PLAIN, 30));
        s.setFont(new Font("Serif", Font.PLAIN, 30));

        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(l1,constraints);

        constraints.gridx = 1;
        panel.add(t1,constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(l2,constraints);

        constraints.gridx = 1;
        panel.add(t2,constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(start,constraints);

        constraints.gridx = 1;
        panel.add(reset,constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(m,constraints);

        constraints.gridx = 1;
        panel.add(s,constraints);

        add(panel);
        start.addActionListener(handler);
        reset.addActionListener(handler);



    }

    public class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == start){
                isRun = true;
                int min = Integer.parseInt(t1.getText());
                int sec = Integer.parseInt(t2.getText());
                Thread thread = new Thread(new TimerRunnable(min,sec));
                thread.start();
            }
            if (e.getSource() == reset){
                isRun = false;

            }
        }
    }

    public class TimerRunnable implements Runnable {


        public TimerRunnable(int min, int sec) {
            this.min = min;
            this.sec = sec;
        }

        private int min;
        private int sec;

        @Override
        public void run() {
            for (int i = min; i >=0; i--) {
                m.setText(""+min);
                for (int j = sec; j >= 0; j--){
                    s.setText(""+(sec<10?"0"+sec:sec));
                    if (!isRun){
                        break;
                    }
                    sec--;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                min --;
                sec = 59;
            }
            m.setText("");
            s.setText("");
        }
    }
}
