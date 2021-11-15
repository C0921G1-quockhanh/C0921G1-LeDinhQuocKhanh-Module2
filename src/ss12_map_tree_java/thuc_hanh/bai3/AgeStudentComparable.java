package ss12_map_tree_java.thuc_hanh.bai3;

public class AgeStudentComparable extends Student implements Comparable<AgeStudentComparable> {
    public AgeStudentComparable(String name, int age, String address) {
        super(name, age, address);
    }

    @Override
    public int compareTo(AgeStudentComparable o) {
        if (getAge() > o.getAge())
            return 1;
        if (getAge() < o.getAge())
            return -1;
        return 0;
    }
}
