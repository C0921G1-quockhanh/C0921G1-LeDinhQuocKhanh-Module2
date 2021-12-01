package FuramaResort.services;

import FuramaResort.models.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    Scanner sc = new Scanner(System.in);

    List<Customer> customers = new LinkedList<>();

    public void add(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void displayList() {
        for (Customer customer: customers) {
            System.out.println(customer);
        }
    }

    @Override
    public void addNew() {
        System.out.println("Enter your customer code: ");
        String customerCode = sc.nextLine();

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your date of birth: ");
        String dateOfBirth = sc.nextLine();

        System.out.println("Enter your sex: ");
        String sex = sc.nextLine();

        System.out.println("Enter your identity number: ");
        String identityNumber = sc.nextLine();

        System.out.println("Enter your phone number: ");
        String phoneNumber = sc.nextLine();

        System.out.println("Enter your mail: ");
        String email = sc.nextLine();

        System.out.println("Enter your type of customer: ");
        String typeOfCustomer = sc.nextLine();

        System.out.println("Enter your address: ");
        String address = sc.nextLine();

        Customer customer = new Customer(customerCode,name,dateOfBirth,sex,identityNumber,phoneNumber,email,typeOfCustomer,address);
        customers.add(customer);
    }

    @Override
    public void edit(String customerCode) {
        Customer customer = get(customerCode);

        int choice = -1;

        while (choice !=0) {
            System.out.println("EDITING INFORMATION: ");
            System.out.println("1.\tEdit identity number");
            System.out.println("2.\tEdit phone number");
            System.out.println("3.\tEdit email");
            System.out.println("4.\tEdit type of customer");
            System.out.println("5.\tEdit address");
            System.out.println("0.\tExit");

            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter new identity number: ");
                    String newIdentityNumber = sc.nextLine();
                    customer.setIdentityNumber(newIdentityNumber);
                    break;

                case 2:
                    System.out.println("Enter new phone number: ");
                    String newPhoneNumber = sc.nextLine();
                    customer.setPhoneNumber(newPhoneNumber);
                    break;

                case 3:
                    System.out.println("Enter new email: ");
                    String newEmail = sc.nextLine();
                    customer.setEmail(newEmail);
                    break;

                case 4:
                    System.out.println("Enter new type of customer: ");
                    String newTypeOfCustomer = sc.nextLine();
                    customer.setTypeOfCustomer(newTypeOfCustomer);
                    break;

                case 5:
                    System.out.println("Enter new address: ");
                    String newAddress = sc.nextLine();
                    customer.setAddress(newAddress);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Please check your option!");
            }
        }
    }

    public Customer get(String customerCode) {
        boolean checkCustomer = false;
        int index = 0;

        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            String personCode = customer.getPersonCode();

            if (personCode.equals(customerCode)) {
                checkCustomer = true;
                index = i;
                break;
            }
        }

        if (checkCustomer)
            return customers.get(index);
        else
            return null;
    }
}
