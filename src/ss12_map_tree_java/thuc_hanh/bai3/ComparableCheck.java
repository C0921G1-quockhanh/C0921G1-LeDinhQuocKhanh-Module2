package ss12_map_tree_java.thuc_hanh.bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableCheck {
    public static void main(String[] args) {
        AgeStudentComparable student1 = new AgeStudentComparable("Kien",30,"HT");
        AgeStudentComparable student2 = new AgeStudentComparable("Nam",26,"HN");
        AgeStudentComparable student3 = new AgeStudentComparable("Anh",38,"HT");
        AgeStudentComparable student4 = new AgeStudentComparable("Tung",38,"HT");

        List<AgeStudentComparable> lists = new ArrayList<>();

        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);

        System.out.println("Pre-sorted: ");
        for (AgeStudentComparable st: lists) {
            System.out.println(st);
        }

        Collections.sort(lists);

        System.out.println("After-sorted: ");
        for (AgeStudentComparable st: lists) {
            System.out.println(st);
        }
    }
}
