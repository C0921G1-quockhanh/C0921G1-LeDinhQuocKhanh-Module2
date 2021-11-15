package ss11_stack_queue_java.bai_tap.bai3;

import java.util.Scanner;
import java.util.Stack;

public class BinarySystem {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int binary;

        while (number != 0) {
            binary = number % 2;
            stack.push(binary);
            number = number / 2;
        }

        System.out.println("The binary number is ");

        while (stack.size() > 0) {
            System.out.print(stack.pop());
        }
    }
}
