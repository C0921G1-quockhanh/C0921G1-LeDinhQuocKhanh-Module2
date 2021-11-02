package ss3_array_method_java.bai_tap;

import java.util.Scanner;

public class CalculateDiagonalOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter square matrix's size: ");
        int squareMatrixSize = scanner.nextInt();

        double[][] arr = new double[squareMatrixSize][squareMatrixSize];

        //Assign Value
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter element [" + i + "][" + j + "]");
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

        //Display Result
        System.out.println("\nThe total value of first diagonal is " + calculateFirstDiagonal(arr));
        System.out.println("The total value of second diagonal is " + calculateSecondDiagonal(arr));
    }

    public static double calculateFirstDiagonal(double[][] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == i) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static double calculateSecondDiagonal(double[][] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == arr[i].length - i - 1) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
}
