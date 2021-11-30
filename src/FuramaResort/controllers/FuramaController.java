package FuramaResort.controllers;

import java.util.Scanner;

public class FuramaController {
    Scanner sc = new Scanner(System.in);

    public void displayMainMenu() {
        int choice = -1;

        while (choice != 0) {
            System.out.println("FURAMA MANAGEMENT SYSTEM: ");
            System.out.println("1.\tEmployee Management");
            System.out.println("2.\tCustomer Management");
            System.out.println("3.\tFacility Management ");
            System.out.println("4.\tBooking Management");
            System.out.println("5.\tPromotion Management");
            System.out.println("0.\tExit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int subChoice1 = -1;

                    while (subChoice1 != 0) {
                        System.out.println("EMPLOYEE MANAGEMENT: ");
                        System.out.println("1.\tDisplay list employees");
                        System.out.println("2.\tAdd new employee");
                        System.out.println("3.\tEdit employee");
                        System.out.println("0.\tReturn main menu");

                        System.out.println("Enter your choice: ");
                        subChoice1 = sc.nextInt();

                        switch (subChoice1) {
                            case 1:

                            case 2:

                            case 3:

                            case 0:
                                System.out.println("Returning to main menu!");
                                break;

                            default:
                                System.out.println("Please check your option!");
                        }
                    }
                    break;

                case 2:
                    int subChoice2 = -1;

                    while (subChoice2 != 0) {
                        System.out.println("CUSTOMER MANAGEMENT: ");
                        System.out.println("1.\tDisplay list customers");
                        System.out.println("2.\tAdd new customer");
                        System.out.println("3.\tEdit customer");
                        System.out.println("0.\tReturn main menu");

                        System.out.println("Enter your choice: ");
                        subChoice2 = sc.nextInt();

                        switch (subChoice2) {
                            case 1:

                            case 2:

                            case 3:

                            case 0:
                                System.out.println("Returning to main menu!");
                                break;

                            default:
                                System.out.println("Please check your option!");
                        }
                    }
                    break;

                case 3:
                    int subChoice3 = -1;

                    while (subChoice3 != 0) {
                        System.out.println("FACILITY MANAGEMENT: ");
                        System.out.println("1.\tDisplay list facility");
                        System.out.println("2.\tAdd new facility");
                        System.out.println("3.\tDisplay list facility maintenance");
                        System.out.println("0.\tReturn main menu");

                        System.out.println("Enter your choice: ");
                        subChoice3 = sc.nextInt();

                        switch (subChoice3) {
                            case 1:

                            case 2:

                            case 3:

                            case 0:
                                System.out.println("Returning to main menu!");
                                break;

                            default:
                                System.out.println("Please check your option!");
                        }
                    }
                    break;

                case 4:
                    int subChoice4 = -1;

                    while (subChoice4 != 0) {
                        System.out.println("BOOKING MANAGEMENT: ");
                        System.out.println("1.\tAdd new booking");
                        System.out.println("2.\tDisplay list booking");
                        System.out.println("3.\tCreate new contract");
                        System.out.println("4.\tDisplay list contracts");
                        System.out.println("5.\tEdit contracts");
                        System.out.println("0.\tReturn main menu");

                        System.out.println("Enter your choice: ");
                        subChoice4 = sc.nextInt();

                        switch (subChoice4) {
                            case 1:

                            case 2:

                            case 3:

                            case 4:

                            case 5:

                            case 0:
                                System.out.println("Returning to main menu!");
                                break;

                            default:
                                System.out.println("Please check your option!");
                        }
                    }
                    break;

                case 5:
                    int subChoice5 = -1;

                    while (subChoice5 != 0) {
                        System.out.println("PROMOTION MANAGEMENT: ");
                        System.out.println("1.\tDisplay list customers use service");
                        System.out.println("2.\tDisplay list customers get voucher");
                        System.out.println("0.\tReturn main menu");

                        System.out.println("Enter your choice: ");
                        subChoice5 = sc.nextInt();

                        switch (subChoice5) {
                            case 1:

                            case 2:

                            case 0:
                                System.out.println("Returning to main menu!");
                                break;

                            default:
                                System.out.println("Please check your option!");
                        }
                    }
                    break;

                case 0:
                    System.exit(0);

                default:
                    System.out.println("Please check your option!");
            }
        }
    }
}
