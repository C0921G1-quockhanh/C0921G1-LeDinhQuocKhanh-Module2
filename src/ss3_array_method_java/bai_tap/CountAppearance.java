package ss3_array_method_java.bai_tap;

import java.util.Scanner;

public class CountAppearance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "Le Dinh Quoc Khanh C0921G1 CodeGym Da Nang";

        System.out.println("Enter a character: ");
        char word = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == word) {
                count += 1;
            }
        }

        System.out.println("Số lần kí tự xuất hiện là " + count);
    }
}
