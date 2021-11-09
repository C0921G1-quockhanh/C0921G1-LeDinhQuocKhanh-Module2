package ss7_abstract_class_interface_java.bai_tap.bai1.geometric;

import ss7_abstract_class_interface_java.bai_tap.bai1.resizable.Resize;

public class Circle extends Geometric implements Resize {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A circle with the radius = " + this.radius + " and the area is " + this.getArea() + " , which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        setRadius(this.getRadius() * (100 + percent) / 100);
    }
}
