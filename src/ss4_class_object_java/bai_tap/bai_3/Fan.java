package ss4_class_object_java.bai_tap.bai_3;

public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5.0;
        this.color = "blue";
    }

    public int getSpeed() {
        return this.speed;
    }
    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    public boolean getOn() {
        return this.on;
    }
    public void setOn(boolean newOn) {
        this.on = newOn;
    }

    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public String getColor() {
        return this.color;
    }
    public void setColor(String newColor) {
        this.color = newColor;
    }

    public String toString() {
        return (this.getOn()) ? "the fan is on with speed is " + this.getSpeed() + " and the color is " + this.getColor() + " and the radius is " + this.getRadius() :
                "the fan is off with the color is " + this.getColor() + " and the radius is " + this.getRadius();
    }
}
