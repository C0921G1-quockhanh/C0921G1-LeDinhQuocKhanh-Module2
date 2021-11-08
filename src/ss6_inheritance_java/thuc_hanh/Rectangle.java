package ss6_inheritance_java.thuc_hanh;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle() {
        this.height = 1.0;
        this.width = 1.0;
    }
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public Rectangle(double height, double width, String color, Boolean filled) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }
    public void setHeight(double newHeight) {
        this.height = newHeight;
    }

    public double getWidth() {
        return this.width;
    }
    public void setWidth(double newWidth) {
        this.width = newWidth;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    @Override
    public String toString() {
        return "A rectangle with width = " + this.width + " and height = " + this.height + " , which is a subclass of " + super.toString();
    }
}
