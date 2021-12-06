package FuramaResort.controllers;

import FuramaResort.services.class_impl.BookingServiceImpl;
import FuramaResort.services.class_impl.CustomerServiceImpl;
import FuramaResort.services.class_impl.EmployeeServiceImpl;
import FuramaResort.services.class_impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    Scanner sc = new Scanner(System.in);

    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    BookingServiceImpl  bookingService = new BookingServiceImpl();
    FacilityServiceImpl facilityService = bookingService.getFacilityService();

    public EmployeeServiceImpl getEmployeeService() {
        return employeeService;
    }

    public CustomerServiceImpl getCustomerService() {
        return customerService;
    }

    public BookingServiceImpl getBookingService() {
        return bookingService;
    }

    public FacilityServiceImpl getFacilityService() {
        return facilityService;
    }

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
            choice = Integer.parseInt(sc.nextLine());

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
                        subChoice1 = Integer.parseInt(sc.nextLine());

                        switch (subChoice1) {
                            case 1:
                                employeeService.displayList();
                                break;

                            case 2:
                                employeeService.addNew();
                                break;

                            case 3:
                                System.out.println("Enter the code of employee you want to edit: ");
                                String employeeCode = sc.nextLine();

                                employeeService.edit(employeeCode);
                                break;

                            case 0:
                                employeeService.writeEmployeeToCSV();
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
                        subChoice2 = Integer.parseInt(sc.nextLine());

                        switch (subChoice2) {
                            case 1:
                                customerService.displayList();
                                break;

                            case 2:
                                customerService.addNew();
                                break;

                            case 3:
                                System.out.println("Enter the code of customer you want to edit: ");
                                String customerCode = sc.nextLine();

                                customerService.edit(customerCode);
                                break;

                            case 0:
                                customerService.writeCustomerToCSV();
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
                        subChoice3 = Integer.parseInt(sc.nextLine());

                        switch (subChoice3) {
                            case 1:
                                facilityService.displayList();
                                break;

                            case 2:
                                int facilityChoice = -1;

                                while (facilityChoice != 0) {
                                    System.out.println("ADDING NEW FACILITY");
                                    System.out.println("1.\tAdd new Villa");
                                    System.out.println("2.\tAdd new House");
                                    System.out.println("3.\tAdd new Room");
                                    System.out.println("0.\tBack to menu");

                                    System.out.println("Enter your choice: ");
                                    facilityChoice = Integer.parseInt(sc.nextLine());

                                    switch (facilityChoice) {
                                        case 1:
                                        case 2:
                                        case 3:
                                            facilityService.addNew();
                                            break;

                                        case 0:
                                            break;

                                        default:
                                            System.out.println("Please check your option!");
                                    }
                                }
                                break;

                            case 3:
                                facilityService.displayListFacilityMaintenance();
                                break;

                            case 0:
                                facilityService.writeVillaToCSV();
                                facilityService.writeHouseToCSV();
                                facilityService.writeRoomToCSV();
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
                        System.out.println("1.\tDisplay list booking");
                        System.out.println("2.\tAdd new booking");
                        System.out.println("3.\tDisplay list contracts");
                        System.out.println("4.\tAdd new contract");
                        System.out.println("5.\tEdit contract");
                        System.out.println("0.\tReturn main menu");

                        System.out.println("Enter your choice: ");
                        subChoice4 = Integer.parseInt(sc.nextLine());

                        switch (subChoice4) {
                            case 1:
                                bookingService.displayList();
                                break;

                            case 2:
                                customerService.displayList();
                                System.out.println("---------------------------------");
                                facilityService.displayList();

                                bookingService.addNew();
                                break;

                            case 3:

                            case 4:

                            case 5:

                            case 0:
                                bookingService.writeBookingToCSV();
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
                        subChoice5 = Integer.parseInt(sc.nextLine());

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
