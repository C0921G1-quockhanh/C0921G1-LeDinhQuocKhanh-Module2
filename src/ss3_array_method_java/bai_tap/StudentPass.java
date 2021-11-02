package ss3_array_method_java.bai_tap;

import java.util.Scanner;

public class StudentPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Size of Array
        int size;
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Size does not exceed 30!");
            }
        } while (size > 30);

        //Assign mark and condition (0 <= mark <= 10)
        int[] arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Enter a mark for student " + (i+1) + " :");
            arr[i] = scanner.nextInt();
            if (arr[i] < 0 || arr[i] > 10) {
                continue;
            }
            i++;
        }

        //CountStudentPass
        int countStudent = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] >= 5) {
                countStudent += 1;
            }
        }
        System.out.println("The number of students passing the test is " + countStudent);
    }
}
