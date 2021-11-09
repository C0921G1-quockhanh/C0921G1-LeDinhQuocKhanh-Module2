package ss7_abstract_class_interface_java.bai_tap.bai2.geometric;

public class SquareTest {
    public static void main(String[] args) {
        Geometric[] geometrics = new Geometric[2];

        geometrics[0] = new Square(5.0);
        geometrics[1] = new Square(10.0, "yellow");

        for (Geometric geometric: geometrics) {
            System.out.println(geometric);

            if (geometric instanceof Square) {
                if ((geometric).getColor() != null) {
                    ((Square)geometric).howToColor();
                } else {
                    System.out.println("No color!");
                }
            }
        }
    }
}
