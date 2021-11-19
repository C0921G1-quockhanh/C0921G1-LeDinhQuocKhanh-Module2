package ss15_debug_exception_java.thuc_hanh.bai2;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];

        System.out.println("Your input list: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }

        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the input of element you want to know: ");
        int index = sc.nextInt();

        try {
            System.out.println("The element is " + arr[index]);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index is out of bound!");
        }
    }
}
