package ss17_file_serialization_java.thuc_hanh.bai2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void writeToFile(String path, List<Student> studentList) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(studentList);
            oos.close();
            fos.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path) {
        List<Student> studentList = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);

           studentList = (List<Student>) ois.readObject();
           fis.close();
           ois.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        return studentList;
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        Student student1 = new Student(1, "Vũ Kiều Anh", "Hà Nội");
        Student student2 = new Student(2, "Nguyễn Minh Quân", "Hà Nội");
        Student student3 = new Student(3, "Đặng Huy Hoà", "Đà Nẵng");
        Student student4 = new Student(4, "Nguyễn Khánh Tùng", "Hà Nội");
        Student student5 = new Student(5, "Nguyễn Khắc Nhật", "Hà Nội");

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        writeToFile("E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\ss17_file_serialization_java\\thuc_hanh\\bai2\\output.txt",studentList);
        List<Student> studentDataFromFile = readDataFromFile("E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\ss17_file_serialization_java\\thuc_hanh\\bai2\\output.txt");

        for (Student student: studentDataFromFile) {
            System.out.println(student);
        }
    }
}
