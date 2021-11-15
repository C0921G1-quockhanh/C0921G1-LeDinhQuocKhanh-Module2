package ss12_map_tree_java.thuc_hanh.bai3;

import java.util.Comparator;

public class AgeStudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getAge() > s2.getAge())
            return 1;
        if (s1.getAge() < s2.getAge())
            return -1;
        return 0;
    }
}
