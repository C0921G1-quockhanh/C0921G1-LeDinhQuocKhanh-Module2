package ss5_access_modifier_static_keyword.bai_tap.Bai1;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){
    }

    public Circle(double newRadius) {
        this.radius = newRadius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}
