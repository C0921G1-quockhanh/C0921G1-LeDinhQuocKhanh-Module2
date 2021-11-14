package ss11_stack_queue_java.bai_tap.bai1;

import java.util.Stack;

public class ReverseStringStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        String question = "how to reverse a string by using stack in java";

        System.out.println("Before reversing: ");
        String[] words = question.split("\\s");
        for (String word: words) {
            System.out.print(word + " ");
        }

        for (String word: words) {
            stack.push(word);
        }

        System.out.println("\nAfter reversing: ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(stack.pop() + " ");
        }
    }
}
