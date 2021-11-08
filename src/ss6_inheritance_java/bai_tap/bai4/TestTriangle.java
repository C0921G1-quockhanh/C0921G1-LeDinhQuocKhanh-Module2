package ss6_inheritance_java.bai_tap.bai4;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side 1: ");
        double side1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter side 2: ");
        double side2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter side 3: ");
        double side3 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter color of triangle: ");
        String color = scanner.nextLine();

        if (Triangle.isTriangle(side1,side2,side3)) {
            Triangle triangle = new Triangle(side1,side2,side3,color,true);
            System.out.println(triangle);
        } else {
            System.out.println("The shape is not triangle!");
        }
    }
}
