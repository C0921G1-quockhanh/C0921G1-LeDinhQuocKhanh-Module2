package ss7_abstract_class_interface_java.thuc_hanh.bai2;


import ss6_inheritance_java.thuc_hanh.Circle;

public class CompareCircle extends Circle implements Comparable<CompareCircle> {
    public CompareCircle() {
    }

    public CompareCircle(double radius) {
        super(radius);
    }

    public CompareCircle(String color, Boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(CompareCircle o) {
        if (getRadius() > o.getRadius()) {
            return 1;
        } else if (getRadius() < o.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }
}
