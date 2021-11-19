package ss14_sorting_algorithms_java.thuc_hanh.bai2;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = sc.nextInt();

        int[] list = new int[size];
        System.out.println("Enter " + size + " values: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println("Element " + (i+1) + ":");
            list[i] = sc.nextInt();
        }

        System.out.println("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

        System.out.println("\nBegin sort processing: ");

        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;

        for (int i = 0; i < list.length - 1 && needNextPass; i++) {
            needNextPass = false;

            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j+1]) {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;

                    needNextPass = true;
                }
            }

            if (needNextPass == false) {
                System.out.println("At round " + (i+1) + " ,array may be sorted and next pass not needed!");
                break;
            }

            System.out.println();

            System.out.println("List after " + (i+1) + " rounds: ");
            for (int k = 0; k < list.length; k++) {
                System.out.print(list[k] + "\t");
            }

            System.out.println();
        }
    }
}
