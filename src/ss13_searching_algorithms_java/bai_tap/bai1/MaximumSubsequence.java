package ss13_searching_algorithms_java.bai_tap.bai1;

import java.util.Scanner;

public class MaximumSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();

        //Tao mang de luu ma ascii tuong ung voi tung ki tu
        int[] asciiArr = new int[inputString.length()];

        for (int i = 0; i < inputString.length(); i++) {
            int ascii = inputString.charAt(i);
            asciiArr[i] = ascii;
        }

        //Tao 2 mang maxLength - positionOfPreviousChar
        int[] maxLength = new int[asciiArr.length];
        int[] positionOfPreviousChar = new int[asciiArr.length];

        for (int i = 0; i < asciiArr.length; i++) {
            maxLength[i] = 1;
            positionOfPreviousChar[i] = -1;

            for (int j = 0; j < i; j++) {
                if (asciiArr[i] > asciiArr[j] && maxLength[i] < maxLength[j] + 1) {
                    maxLength[i] = maxLength[j] + 1;
                    positionOfPreviousChar[i] = j;
                }
            }
        }

        //Tim ra gia tri lon nhat trong maxLength
        int maxOfLength = maxLength[0];
        int indexOfMax = 0;

        for (int i = 1; i < maxLength.length; i++) {
            if (maxLength[i] > maxOfLength) {
                maxOfLength = maxLength[i];
                indexOfMax = i;
            }
        }

        //Ket qua bai toan
        String result = "";

        while (indexOfMax != -1) {
            result = inputString.charAt(indexOfMax) + result;
            indexOfMax = positionOfPreviousChar[indexOfMax];
        }

        System.out.println(result);
    }
}
