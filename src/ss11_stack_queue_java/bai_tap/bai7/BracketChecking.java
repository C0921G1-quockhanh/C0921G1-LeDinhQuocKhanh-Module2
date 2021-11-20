package ss11_stack_queue_java.bai_tap.bai7;

import java.util.Scanner;
import java.util.Stack;

public class BracketChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an expression: ");
        String expression = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            if (currentChar == '(') {
                stack.push(currentChar);
            } else if (currentChar == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    stack.push(currentChar);
                    break;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Setting bracket is right!");
        } else {
            System.out.println("Setting bracket is wrong!");
        }
    }
}
