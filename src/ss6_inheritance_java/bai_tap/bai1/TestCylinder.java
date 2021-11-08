package ss6_inheritance_java.bai_tap.bai1;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        System.out.println("The area is " + cylinder.getArea() + " and the volume is " + cylinder.getVolume());

        cylinder = new Cylinder(5.0);
        System.out.println(cylinder);
        System.out.println("The area is " + cylinder.getArea() + " and the volume is " + cylinder.getVolume());

        cylinder = new Cylinder(5.0, 5.0, "blue");
        System.out.println(cylinder);
        System.out.println("The area is " + cylinder.getArea() + " and the volume is " + cylinder.getVolume());
    }
}
