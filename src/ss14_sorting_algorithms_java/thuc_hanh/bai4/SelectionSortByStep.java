package ss14_sorting_algorithms_java.thuc_hanh.bai4;

import java.util.Scanner;

public class SelectionSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int listSize = sc.nextInt();

        double[] list = new double[listSize];
        System.out.println("Enter " + listSize + " values: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println("Element " + (i+1) + ":");
            list[i] = sc.nextDouble();
        }

        System.out.println("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        System.out.println("\nBegin processing: ");
        selectionSortByStep(list);

    }

    public static void selectionSortByStep(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMax = list[i];
            int currentMaxIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] > currentMax) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }

            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }

            System.out.println();
            System.out.println("List after " + (i + 1) + " rounds");
            for (int k = 0; k < list.length; k++) {
                System.out.print(list[k] + " ");
            }
        }
    }
}
