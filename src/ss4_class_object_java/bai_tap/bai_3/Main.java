package ss4_class_object_java.bai_tap.bai_3;

public class Main {
    public static void main(String[] args) {
        //Obj1
        Fan fan1 = new Fan();
            fan1.setSpeed(Fan.FAST);
            fan1.setRadius(10);
            fan1.setColor("yellow");
            fan1.setOn(true);

        //Obj2
        Fan fan2 = new Fan();
            fan2.setSpeed(Fan.MEDIUM);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
