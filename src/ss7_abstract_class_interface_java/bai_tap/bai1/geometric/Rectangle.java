package ss7_abstract_class_interface_java.bai_tap.bai1.geometric;

import ss7_abstract_class_interface_java.bai_tap.bai1.resizable.Resize;

public class Rectangle extends Geometric implements Resize {
    private double width;
    private double length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public String toString() {
        return "A rectangle with the length = " + this.length + " ,the width = " + this.width + " and the area is " + this.getArea() + " , which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        setWidth(this.getWidth() * (100 + percent) / 100);
        setLength(this.getLength() * (100 + percent) / 100);
    }
}
