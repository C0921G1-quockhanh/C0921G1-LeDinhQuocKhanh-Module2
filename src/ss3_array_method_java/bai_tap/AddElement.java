package ss3_array_method_java.bai_tap;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {10,4,6,7,8,0,0,0,0,0};
        int X = 3;

        System.out.println("Enter the index: ");
        int indexAdd = scanner.nextInt();

        if (indexAdd < 0 || indexAdd > arr.length - 2) {
            System.out.println("Cannot add element into the array!");
        } else {
            for (int i = arr.length - 1; i > indexAdd; i--) {
                arr[i] = arr[i - 1];
            }
            arr[indexAdd] = X;
        }

        System.out.printf("%-30s%s", "Add Element List:", "");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
