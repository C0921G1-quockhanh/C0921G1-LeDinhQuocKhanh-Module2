package ss7_abstract_class_interface_java.bai_tap.bai1.geometric;

import ss7_abstract_class_interface_java.bai_tap.bai1.resizable.Resize;

import java.util.Scanner;

public class GeometricTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter percent: ");
        double percent = scanner.nextDouble();

        Geometric[] geometrics = new Geometric[3];

        geometrics[0] = new Circle(5.0, "red");
        geometrics[1] = new Rectangle(5.0, 10.0, "yellow");
        geometrics[2] = new Square(10.0, "white");

        System.out.println("Pre-resize: ");
        for (Geometric geometric: geometrics) {
            System.out.println(geometric);
        }

        System.out.println("After-resize: ");
        for (Geometric geometric: geometrics) {

            if (geometric instanceof Circle) {
                ((Circle)geometric).resize(percent);
            }

            if (geometric instanceof Rectangle) {
                ((Rectangle)geometric).resize(percent);
            }

            if (geometric instanceof Square) {
                ((Square)geometric).resize(percent);
            }

            System.out.println(geometric);
        }

    }
}
