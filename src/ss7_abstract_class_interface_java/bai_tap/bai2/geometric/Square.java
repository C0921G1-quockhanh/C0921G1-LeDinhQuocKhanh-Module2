package ss7_abstract_class_interface_java.bai_tap.bai2.geometric;

import ss7_abstract_class_interface_java.bai_tap.bai2.howToColor.Colorable;

public class Square extends Geometric implements Colorable {
    private double edge;

    public Square() {
        this.edge = 1.0;
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(double edge, String color) {
        super(color);
        this.edge = edge;
    }

    public double getEdge() {
        return this.edge;
    }
    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return this.edge * this.edge;
    }

    @Override
    public String toString() {
        return "A square with the edge = " + this.edge + " and the area is " + this.getArea();
    }

    @Override
    public void howToColor() {
        System.out.println("Color " + super.getColor() + " all four sides!");
    }
}
