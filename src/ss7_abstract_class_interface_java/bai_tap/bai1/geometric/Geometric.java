package ss7_abstract_class_interface_java.bai_tap.bai1.geometric;

public abstract class Geometric {
    private String color;

    public Geometric() {
        this.color = "blue";
    }

    public Geometric(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "a shape with color of " + this.color;
    }
}
