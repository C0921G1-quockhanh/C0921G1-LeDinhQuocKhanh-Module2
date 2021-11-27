package ss21_creational_design_pattern.bai_tap.bai1;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Circle circle = (Circle)shapeFactory.getShape("Circle");
        circle.draw();

        Square square = (Square)shapeFactory.getShape("Square");
        square.draw();

        Rectangle rectangle = (Rectangle)shapeFactory.getShape("Rectangle");
        rectangle.draw();
    }
}
