package ss2_loop_statement_java.bai_tap;

import java.util.Scanner;

public class MenuOfShape {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);

        while (choice != 0) {
            System.out.println("Menu: ");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle top-left");
            System.out.println("3. Print the square triangle top-right");
            System.out.println("4. Print the square triangle bottom-left");
            System.out.println("5. Print the square triangle bottom-right");
            System.out.println("6. Print isosceles triangle");
            System.out.println("0. Exit");

            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    for (int i = 1; i <= 4; i++) {
                        for (int j = 1; j <= 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle top-left");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Print the square triangle top-right");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (j < 5 - i + 1) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Print the square triangle bottom-left");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (j <= 5 - i + 1) {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Print the square triangle bottom-right");
                    for (int i = 1; i <=5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (j >= i) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("Print the isosceles triangle");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 1; j < 10; j++) {
                            if ((5 - i) <= j && j <= (5 + i)) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
