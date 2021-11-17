package ss13_searching_algorithms_java.bai_tap.bai3;

import java.util.Scanner;

public class MaximumConsecutiveSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();

        int[] asciiArr = new int[inputString.length()];

        for (int i = 0; i < inputString.length(); i++) {
            int ascii = inputString.charAt(i);
            asciiArr[i] = ascii;
        }

        String tempString = inputString.charAt(0) + "";
        String maxString = tempString;

        for (int i = 1; i < asciiArr.length; i++) {
            if (asciiArr[i] > asciiArr[i-1])
                tempString += inputString.charAt(i);
            else
                tempString = inputString.charAt(i) + "";

            if (tempString.length() > maxString.length()) {
                maxString = tempString;
            }
        }

        System.out.println("The maximum consecutive subsequence is " + maxString);
    }
}
