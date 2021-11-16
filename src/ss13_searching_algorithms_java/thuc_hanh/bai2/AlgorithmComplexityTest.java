package ss13_searching_algorithms_java.thuc_hanh.bai2;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();

        int[] frequentArr = new int[255];                                   //O(1)

        for (int i = 0; i < inputString.length(); i++) {                    //O(n)
            int ascii = (int) inputString.charAt(i);
            frequentArr[ascii] += 1;
        }

        int max = 0;                                                        //O(1)
        char character = (char) 255;                                        //O(1)

        for (int i = 0; i < 255; i++) {                                     //O(255)
            if (frequentArr[i] > max) {
                max = frequentArr[i];
                character = (char) i;
            }
        }

        System.out.println("The most appearing letter is " + character + " with a frequency of " + max + " times!");
    }
}
