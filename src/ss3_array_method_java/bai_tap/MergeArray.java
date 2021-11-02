package ss3_array_method_java.bai_tap;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = new int[4];
        for (int i = 0; i < firstArr.length; i++) {
            System.out.println("Enter element " + (i+1) + " :");
            firstArr[i] = scanner.nextInt();
        }

        int[] secondArr = new int[6];
        for (int i = 0; i < secondArr.length; i++) {
            System.out.println("Enter element " + (i+1) + " :");
            secondArr[i] = scanner.nextInt();
        }

        int[] mergeArr = new int[10];

        for (int i = 0; i < firstArr.length; i++) {
            mergeArr[i] = firstArr[i];
        }

        for (int i = 0; i < secondArr.length; i++) {
            mergeArr[i + firstArr.length] = secondArr[i];
        }

        System.out.printf("%-20s%s", "Merge Array List:", "");
        for (int i = 0; i < mergeArr.length; i++) {
            System.out.print(mergeArr[i] + "\t");
        }

    }
}
