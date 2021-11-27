package ss21_creational_design_pattern.bai_tap.bai1;

public class ShapeFactory {
    public Shape getShape(String shape) {
        if ("Circle".equals(shape))
            return new Circle();
        else if ("Square".equals(shape))
            return new Square();
        else
            return new Rectangle();
    }
}