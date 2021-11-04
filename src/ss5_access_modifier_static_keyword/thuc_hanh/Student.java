package ss5_access_modifier_static_keyword.thuc_hanh;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDITT";

    Student(int r, String n) {
        this.rollno = r;
        this.name = n;
    }
    static void change() {
        college = "CODEGYM";
    }
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
