package final_exam.controller;

import final_exam.models.Phone;
import final_exam.services.PhoneManager;

import java.util.Scanner;

public class PhoneController {
    Scanner sc = new Scanner(System.in);

    PhoneManager phoneManager = new PhoneManager();

    int choice = -1;

    public void displaySystem() {
        while (choice != 0) {
            System.out.println("PHONE MANAGEMENT SYSTEM");
            System.out.println("1.\tAdding new authentic phone");
            System.out.println("2.\tAdding new hand phone");
            System.out.println("3.\tDeleting selected phone");
            System.out.println("4.\tDisplaying all phones");
            System.out.println("5.\tSearching selected phone");
            System.out.println("0.\tExit");

            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    phoneManager.addPhone("AuthenticPhone");
                    break;

                case 2:
                    phoneManager.addPhone("HandPhone");
                    break;

                case 3:
                    this.getOption();
                    break;

                case 4:
                    phoneManager.displayPhoneList();
                    break;

                case 5:
                    System.out.println("Enter the ID: ");
                    int id2 = Integer.parseInt(sc.nextLine());

                    phoneManager.searchPhone(id2);
                    break;

                case 0:
                    phoneManager.writeAuthenticPhoneToCSV();
                    phoneManager.writeHandPhoneToCSV();
                    System.exit(0);

                default:
                    System.out.println("No choice!");
            }
        }
    }

    public void getOption() {
        System.out.println("Do you want to delete? Choose Y to delete the selected phone or N to return main screen");

        String option = sc.nextLine();

        while (!option.equals("Y") && !option.equals("N")) {
            System.out.println("Please check your option! Enter again: ");
            option = sc.nextLine();
        }

        if (option.equals("Y")) {
            System.out.println("Enter the ID: ");
            int id1 = Integer.parseInt(sc.nextLine());

            Phone deletedPhone = phoneManager.deletePhone(id1);
            System.out.println(deletedPhone);
        } else
            displaySystem();
    }
}
