package javaAdvanced.timer;

public class TimerRunnable implements Runnable {
    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public TimerRunnable(int min, int sec) {
        this.min = min;
        this.sec = sec;
    }

    private int min;
    private int sec;

    @Override
    public void run() {
        boolean flag;
        for (int i = min; i >=0; i--) {
            for (int j = sec; j >= 0; j--){
                System.out.println(min + ":" + (sec<10?"0"+sec:sec));
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
    }
}
