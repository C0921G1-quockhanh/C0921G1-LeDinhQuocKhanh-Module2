package ss6_inheritance_java.bai_tap.bai4;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, Boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return this.side1;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return this.side2;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return this.side3;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double halfOfPerimeter = this.getPerimeter() / 2;
        return Math.sqrt(halfOfPerimeter * (halfOfPerimeter - this.side1) * (halfOfPerimeter - this.side2) * (halfOfPerimeter - this.side3));

    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        return String.format("A triangle with three sides is %.2f, %.2f and %.2f. The perimeter is %.2f and the area is %.2f, which is a subclass of %s.",
                this.side1, this.side2, this.side3, this.getPerimeter(), this.getArea(), super.toString());
    }

    public static Boolean isTriangle(double side1, double side2, double side3) {
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }

}
