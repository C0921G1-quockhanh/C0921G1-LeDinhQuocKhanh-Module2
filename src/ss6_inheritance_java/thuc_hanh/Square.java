package ss6_inheritance_java.thuc_hanh;

public class Square extends Rectangle {
    public Square() {
        super();
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, Boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getWidth();
    }
    public void setSide(double newSide) {
        super.setHeight(newSide);
        super.setWidth(newSide);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setHeight(double height) {
        setSide(height);
    }

    @Override
    public String toString() {
        return "A square with side = " + this.getSide() + " , which is a subclass of " + super.toString();
    }
}
