package ss6_inheritance_java.thuc_hanh;

public class Shape {
    private String color;
    private Boolean filled;

    public Shape() {
        color = "green";
        filled = true;
    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }
    public void setColor(String newColor) {
        this.color = newColor;
    }

    public Boolean isFilled() {
        return this.filled;
    }
    public void setFilled(Boolean newFilled) {
        this.filled = newFilled;
    }

    @Override
    public String toString() {
        return "A shape with color of " + this.color + ((this.filled) ? " and filled!" : " and not filled!");
    }
}
