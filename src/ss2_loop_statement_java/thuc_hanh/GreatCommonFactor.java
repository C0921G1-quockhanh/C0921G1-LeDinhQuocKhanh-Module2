package ss2_loop_statement_java.thuc_hanh;

import java.util.Scanner;

public class GreatCommonFactor {
    public static void main(String[] args) {
        int a, b, greatestCommonDivisor;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            if (a == b) {
                System.out.println("No greatest common factor!");
            } else if (a < b) {
                greatestCommonDivisor = b;
                System.out.println("Greatest common factor: " + greatestCommonDivisor);
            } else {
                greatestCommonDivisor = a;
                System.out.println("Greatest common factor: " + greatestCommonDivisor);
            }
        }

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        greatestCommonDivisor = a;
        System.out.println("Greatest common factor: " + greatestCommonDivisor);
    }
}
