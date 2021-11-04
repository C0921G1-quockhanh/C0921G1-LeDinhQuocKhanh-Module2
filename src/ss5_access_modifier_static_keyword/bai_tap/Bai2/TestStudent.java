package ss5_access_modifier_static_keyword.bai_tap.Bai2;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.getName() + " at " + student1.getClasses());
        Student student2 = new Student();
        student2.setName("Ronaldo");
        student2.setClasses("C0921G1");
        System.out.println(student2.getName() + " at " + student2.getClasses());
    }
}
