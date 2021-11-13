package ss7_abstract_class_interface_java.thuc_hanh.bai2;

import ss6_inheritance_java.thuc_hanh.Circle;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        CompareCircle[] circles = new CompareCircle[3];
        circles[0] = new CompareCircle(3.6);
        circles[1] = new CompareCircle();
        circles[2] = new CompareCircle("indigo", false, 3.5);

        System.out.println("Pre-sorted: ");
        for (CompareCircle circle: circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted: ");
        for (CompareCircle circle: circles) {
            System.out.println(circle);
        }
    }
}
