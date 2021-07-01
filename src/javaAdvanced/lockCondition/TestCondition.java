package javaAdvanced.lockCondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestCondition {
    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();
    static int balance = 0;

    public static void main(String[] args) {
        new Pay().start();
        new AddBalance().start();
        }

    static class AddBalance extends Thread{
        @Override
        public void run() {
            lock.lock();
            balance +=100;
            System.out.println("AddBalance thread: " + balance);
            condition.signal();
            lock.unlock();
        }
    }

    static class Pay extends Thread{
        @Override
        public void run() {
            lock.lock();
            if (balance <100) {
                try {
                    System.out.println("Pay thread: " + balance);
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            balance-=100;
            System.out.println("Pay thread: " + balance);
            lock.unlock();
        }
    }
}
