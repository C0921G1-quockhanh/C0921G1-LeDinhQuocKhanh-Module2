package ss13_searching_algorithms_java.bai_tap.bai1;

import java.util.Scanner;

public class MaximumSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();

        //Ascii
        int[] asciiArr = new int[inputString.length()];

        for (int i = 0; i < inputString.length(); i++) {
            int ascii = inputString.charAt(i);
            asciiArr[i] = ascii;
        }

        int[] maxLength = new int[inputString.length()];
        int[] position = new int[inputString.length()];

        for (int i = 0; i < asciiArr.length; i++) {
            maxLength[i] = 1;
            position[i] = -1;
            for (int j = 0; j < i; j++) {
                if (asciiArr[j] < asciiArr[i] && maxLength[i] < maxLength[j] + 1) {
                    maxLength[i] = maxLength[j] + 1;
                    position[i] = j;
                }
            }
        }

        for (int i = 0; i < maxLength.length; i++) {
            System.out.print(maxLength[i]);
        }

        System.out.println();

        for (int i = 0; i < position.length; i++) {
            System.out.print(position[i]);
        }


        int max = maxLength[0];
        int index = 0;

        for (int i = 1; i < maxLength.length; i++) {
            if (maxLength[i] > max) {
                max = maxLength[i];
                index = i;
            }
        }
        System.out.println();
        String result = "";

        while (index != -1) {
            result = inputString.charAt(index) + result;
            index = position[index];
        }

        System.out.println(result);
    }
}
