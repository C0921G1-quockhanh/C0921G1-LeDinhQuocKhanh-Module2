package ss3_array_method_java.thuc_hanh;

import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("The size does not exceed 20!");
            }
        } while (size > 20);

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element " + (i + 1) + " :");
            array[i] = scanner.nextInt();
        }

        System.out.printf("%-20s%s", "Property List: ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        int max = array[0];
        int positionOfMax = 1;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                positionOfMax = i + 1;
            }
        }
        System.out.println("\nThe largest property value in the list is " + max + " at position " + positionOfMax);
    }
}
