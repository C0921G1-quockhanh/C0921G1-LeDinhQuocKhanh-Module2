package ss12_map_tree_java.thuc_hanh.bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorCheck {
    public static void main(String[] args) {
        Student student1 = new Student("Kien",30,"HT");
        Student student2 = new Student("Nam",26,"HN");
        Student student3 = new Student("Anh",38,"HT");
        Student student4 = new Student("Tung",38,"HT");

        List<Student> lists = new ArrayList<>();

        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);

        System.out.println("Before-sorted: ");
        for (Student st: lists) {
            System.out.println(st);
        }

        AgeStudentComparator ageStudentComparator = new AgeStudentComparator();
        Collections.sort(lists,ageStudentComparator);

        System.out.println("After-sorted: ");
        for (Student st: lists) {
            System.out.println(st);
        }
    }
}
