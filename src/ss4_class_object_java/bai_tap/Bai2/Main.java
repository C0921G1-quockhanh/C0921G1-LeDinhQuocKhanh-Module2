package ss4_class_object_java.bai_tap.Bai2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StopWatch stop1 = new StopWatch();

        //Start Time
        stop1.start();
        System.out.println("Start Time is " + stop1.getStartTime());

        //Array
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100000);
        }
        selectionSort(arr);

        //End Time
        stop1.stop();
        System.out.println("\nEnd Time is " + stop1.getEndTime());

        //Elapsed Time
        System.out.println("Elapsed Time is " + stop1.getElapsedTime());
    }

    public static void selectionSort(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
