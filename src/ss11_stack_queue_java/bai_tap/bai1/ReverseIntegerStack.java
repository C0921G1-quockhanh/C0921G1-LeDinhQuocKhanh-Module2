package ss11_stack_queue_java.bai_tap.bai1;

import java.util.Scanner;
import java.util.Stack;

public class ReverseIntegerStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity of the array: ");
        int capacity = sc.nextInt();

        int[] arr = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*10);
        }

        System.out.println("Before reversing: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        System.out.println("\nAfter reversing: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(stack.pop() + "\t");
        }
    }
}
