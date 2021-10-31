package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate = 23000;

        System.out.println("Enter the number of USD you want to convert: ");
        double USD = scanner.nextDouble();

        double VND = USD * rate;
        System.out.printf("The value of VND after conversion is %f", VND);
    }
}
