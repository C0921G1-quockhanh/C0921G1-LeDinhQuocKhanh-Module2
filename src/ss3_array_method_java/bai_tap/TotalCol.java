package ss3_array_method_java.bai_tap;

import java.util.Scanner;

public class TotalCol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Declare rows and cols
        System.out.println("Enter the rows: ");
        int row = scanner.nextInt();
        System.out.println("Enter the cols: ");
        int col = scanner.nextInt();

        //Assign value
        double[][] arr = new double[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter element [" + i + "][" +j +"]");
                arr[i][j] = scanner.nextDouble();
            }
        }

        //Display Array
        System.out.printf("%s", "Array List:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
        }

        //Calculate Total of Col that client want
        int colClientWant;
        do {
            System.out.println("\nEnter the col you want to calculate: ");
            colClientWant = scanner.nextInt();
            if (colClientWant < 0 || colClientWant > col - 1) {
                System.out.println("\nPlease check the col!");
            }
        } while (colClientWant < 0 || colClientWant > col - 1);

        for (int j = 0; j < arr[0].length; j++) {
            double total = 0;
            for (int i = 0; i < arr.length; i++) {
                total += arr[i][j];
            }
            if (j == colClientWant) {
                System.out.println("\nThe total value of col " + j + " is " + total);
            }
        }
    }
}
