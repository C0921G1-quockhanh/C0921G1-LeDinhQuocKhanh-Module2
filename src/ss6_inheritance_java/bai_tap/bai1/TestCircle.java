package ss6_inheritance_java.bai_tap.bai1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        System.out.println("The area is " + circle.getArea());

        circle = new Circle(5, "blue");
        System.out.println(circle);
        System.out.println("The area is " + circle.getArea());
    }
}
