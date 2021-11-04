package ss4_class_object_java.bai_tap.Bai1;

public class QuadraticEquation {
    private double a,b,c;
    QuadraticEquation(double inputA, double inputB, double inputC) {
        this.a = inputA;
        this.b = inputB;
        this.c = inputC;
    }
    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }
    public double getDiscriminant() {
        double delta = getB() * getB() - 4 * getA() * getC();
        return delta;
    }
    public double getRoot1() {
        double root1 = (-getB() + Math.sqrt(getDiscriminant())) / (2 * getA());
        return root1;
    }
    public double getRoot2() {
        double root2 = (-getB() - Math.sqrt(getDiscriminant())) / (2 * getA());
        return root2;
    }
    public double getRoot3() {
        double root3 = (-getB()) / (2 * getA());
        return root3;
    }
}
