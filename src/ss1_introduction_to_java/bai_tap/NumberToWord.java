package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int toWord;

        if (number > 0) {
            if (number < 10) {
                toWord = number;
            } else if (number < 20) {
                toWord = number;
            } else if (number < 100) {
                toWord = number;
            } else {
                toWord = number;
            }
        } else {
            toWord = 0;
        }

        switch (toWord) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Please check the number!");
        }
    }
}
