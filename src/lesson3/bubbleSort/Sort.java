package lesson3.bubbleSort;


import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(1000);
        }
        for (int i = 0; i < 99; i++) {
            for (int j = 0; j < 99 -i; j++) {
                if (arr[j] > arr[j+1]){
                    int c = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = c;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
