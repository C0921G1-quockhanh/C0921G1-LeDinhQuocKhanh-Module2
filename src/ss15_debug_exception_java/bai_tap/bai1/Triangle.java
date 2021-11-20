package ss15_debug_exception_java.bai_tap.bai1;

import java.util.Scanner;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {}

    public Triangle(double side1, double side2, double side3) throws SumSideException,SideException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new SideException();
        } else {
            if (side1 > side2 + side3 || side2 > side1 + side3 || side3 > side1 + side2) {
                throw new SumSideException();
            } else {
                System.out.println("Your triangle is successfully create with 3 sides are " + side1 + ", " + side2 + " and " + side3 + " consecutively!");
            }
        }
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle: " +
                "side1 = " + side1 +
                ", side2 = " + side2 +
                ", side3 = " + side3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side 1: ");
        double side1 = sc.nextDouble();
        System.out.println("Enter side 2: ");
        double side2 = sc.nextDouble();
        System.out.println("Enter side 3: ");
        double side3 = sc.nextDouble();

        try {
            Triangle triangle = new Triangle(side1,side2,side3);
        }
        catch (SideException e) {
            System.out.println("The side of triangle is greater than zero!");
        }
        catch (SumSideException e) {
            System.out.println("The sum of any two sides is greater than the other side!");
        }

    }
}
