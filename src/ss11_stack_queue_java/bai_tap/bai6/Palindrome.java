package ss11_stack_queue_java.bai_tap.bai6;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        String inputString = input.toLowerCase();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        char[] reverseChar = new char[inputString.length()];
        for (int i = 0; i < reverseChar.length; i++) {
            reverseChar[i] = stack.pop();
        }

        boolean palindrome = true;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) != reverseChar[i]) {
                palindrome = false;
                break;
            }
        }

        if (palindrome) {
            System.out.println("This string is absolutely palindrome!");
        } else {
            System.out.println("This string is not a palindrome!");
        }
    }
}
