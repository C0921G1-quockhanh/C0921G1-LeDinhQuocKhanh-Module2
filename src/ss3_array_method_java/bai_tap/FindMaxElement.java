package ss3_array_method_java.bai_tap;

import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the rows: ");
        int row = scanner.nextInt();
        System.out.println("Enter the cols: ");
        int col = scanner.nextInt();

        //Assign Value
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter element [" + i + "][" + j +"]");
                arr[i][j] = scanner.nextInt();
            }
        }

        //Display Array
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
        }

        int indexRow = 0;
        int indexCol = 0;
        int max = arr[indexRow][indexCol];

        //Find Max
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i != 0 || j != 0) {
                    if (max < arr[i][j]) {
                        max = arr[i][j];
                        indexRow = i;
                        indexCol = j;
                    }
                }
            }
        }
        System.out.println("\nThe maximum element at [" + indexRow + "][" + indexCol +"] is " + max);
    }
}
