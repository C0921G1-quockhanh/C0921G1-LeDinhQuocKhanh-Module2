package ss3_array_method_java.bai_tap;

import java.util.Scanner;

public class FindMinimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a size: ");
        int size = scanner.nextInt();

        //Assign Value
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element " + (i+1) + " :");
            arr[i] = scanner.nextInt();
        }

        //Display Array
        System.out.printf("%-20s%s", "Array List:", "");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        int minValue = arr[0];
        int indexOfMin = 0;

        //Find Min
        for (int i = 0; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
                indexOfMin = i;
            }
        }
        System.out.println("\nThe minimum value at index " + indexOfMin + " is " + minValue);
    }
}
