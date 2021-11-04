package ss4_class_object_java.bai_tap.Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation getAnswer = new QuadraticEquation(a, b, c);

        if (getAnswer.getDiscriminant() > 0) {
            System.out.println("The equation has two roots " + getAnswer.getRoot1() + " and " + getAnswer.getRoot2());
        } else if (getAnswer.getDiscriminant() == 0) {
            System.out.println("The equation has one root " + getAnswer.getRoot3());
        } else {
            System.out.println("The equation has no real roots!");
        }
    }
}
