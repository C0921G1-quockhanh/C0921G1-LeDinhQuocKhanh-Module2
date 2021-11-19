package ss15_debug_exception_java.thuc_hanh.bai3;

import java.util.Scanner;

public class CalculationExample {
    private void calculate(int x, int y) {
        try{
            int sum = x + y;
            int subtraction = x - y;
            int multiplication = x * y;
            int division = x / y;

            System.out.println("Tổng x + y là " + sum);
            System.out.println("Hiệu x- y là " + subtraction);
            System.out.println("Tích x * y là " + multiplication);
            System.out.println("Thương x / y là " + division);
        }
        catch (Exception e) {
            System.err.println("Xảy ra ngoại lệ " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hãy nhập x: ");
        int x = sc.nextInt();

        System.out.println("Hãy nhập y: ");
        int y = sc.nextInt();

        CalculationExample calExample = new CalculationExample();
        calExample.calculate(x,y);
    }
}
