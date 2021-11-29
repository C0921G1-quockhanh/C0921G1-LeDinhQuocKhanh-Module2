package ss22_structural_design_pattern.bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MathCalculatorProxy mathCalculatorProxy = new MathCalculatorProxy();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double first = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double second = scanner.nextDouble();

        System.out.println("first + second = " + mathCalculatorProxy.add(first,second));
        System.out.println("first - second = " + mathCalculatorProxy.sub(first,second));
        System.out.println("first * second = " + mathCalculatorProxy.mul(first,second));
        System.out.println("first / second = " + mathCalculatorProxy.div(first,second));
    }
}
