package lesson2.arrays;


import java.util.Random;

public class MyArray {


    public static void main(String[] args) {
        int[] array1 = new int[100];
        Random random = new Random();
        for (int i = 0; i < 100 ; i++){
            array1[i] = random.nextInt(100);
        }
        for(int i : task2()){
            System.out.print(i + "  ");
        }
    }

    static int[] task1(){
        int[] array = new int[10];
        for (int i = 0; i < 10 ; i++){
            array[i] = 2;
        }
        return array;
    }

    static int[] task2(){
        int[] array = new int[1000];
        for (int i = 0; i < 1000; i++) {
            array[i] = i+1;
        }
        return array;
    }

    static int[] task3() {
        int[] array = new int[10];
        int count = 0;
        for (int i = -19; i <20 ; i+=2) {
            array[count] = i;
            count++;
        }
        return array;
    }

    static void task4(int[] array){
        for(int i : array){
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
    static void task5(double[] array){
        for (double i: array) {
            if (i > 24.12 && i < 467.23){
                System.out.println(i);
            }
        }
    }

    static int task6(int[] array){
       int count = 0;
       for(int i :array){
           if (i % 2 == 0){
               count++;
           }
       }
       return count;
    }

    static void task7(int n){
        if (n > 0 && n < 11) {
            for (int i = 1; i < 11; i++) {
                System.out.println(n + " * " + i + " = " + (n * i));
            }
        }
        else {
            System.out.println("Please input a number in the range 1-10");
        }
    }
}
