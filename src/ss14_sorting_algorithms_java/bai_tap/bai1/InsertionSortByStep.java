package ss14_sorting_algorithms_java.bai_tap.bai1;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = sc.nextInt();

        int[] list = new int[size];
        System.out.println("Enter " + size + " values:");
        for (int i = 0; i < list.length; i++) {
            System.out.println("Element " + (i+1) + ":");
            list[i] = sc.nextInt();
        }

        System.out.println("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        System.out.println("\nBegin processing:");
        insertionSortByStep(list);
    }

    public static void insertionSortByStep(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int j;

            for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
                list[j+1] = list[j];
            }

            list[j+1] = currentElement;

            System.out.println();
            System.out.println("List after " + i + " rounds:");
            for (int k = 0; k < list.length; k++) {
                System.out.print(list[k] + " ");
            }
        }
    }

}
