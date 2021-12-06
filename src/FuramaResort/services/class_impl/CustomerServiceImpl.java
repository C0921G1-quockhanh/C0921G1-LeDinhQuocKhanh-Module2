package FuramaResort.services.class_impl;

import FuramaResort.models.Customer;
import FuramaResort.services.valid_data.ValidDataPerson;
import FuramaResort.services.interfaces.CustomerService;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    Scanner sc = new Scanner(System.in);

    List<Customer> customers;

    ValidDataPerson validCustomer = new ValidDataPerson();

    public static List<Customer> dataCustomer = new LinkedList<>();

    static {
        Customer customer1 = new Customer("C001","Kane","28/7/1993","male",
                "123456456","84-0123334567","kane@gmail.com","Platinum","England");
        Customer customer2 = new Customer("C002","Ronaldo","05/02/1985","male",
                "123456789","84-0771234567","ronaldo@gmail.com","Diamond","Portugal");
        Customer customer3 = new Customer("C003","Messi","24/06/1987","male",
                "987654321","84-0999888777","messi@gmail.com","Gold","Argentina");
        Customer customer4 = new Customer("C004","Phil Foden","28/05/2000","male",
                "444555666","84-0987987987","foden@gmail.com","Silver","England");

        dataCustomer.add(customer1);
        dataCustomer.add(customer2);
        dataCustomer.add(customer3);
        dataCustomer.add(customer4);
    }

    public CustomerServiceImpl() {
        try {
            final String path = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\FuramaResort\\data\\customer.csv";

            File file = new File(path);
            if (!file.exists())
                customers = dataCustomer;
            else {
                customers = new LinkedList<>();
                readCSVToCustomer();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void writeCustomerToCSV() {
        try {
            final String path = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\FuramaResort\\data\\customer.csv";
            FileWriter csvWriter = new FileWriter(path);

            for (Customer customer: customers) {
                csvWriter.append(customer.getPersonCode());
                csvWriter.append(",");
                csvWriter.append(customer.getName());
                csvWriter.append(",");
                csvWriter.append(customer.getDateOfBirth());
                csvWriter.append(",");
                csvWriter.append(customer.getSex());
                csvWriter.append(",");
                csvWriter.append(customer.getIdentityNumber());
                csvWriter.append(",");
                csvWriter.append(customer.getPhoneNumber());
                csvWriter.append(",");
                csvWriter.append(customer.getEmail());
                csvWriter.append(",");
                csvWriter.append(customer.getTypeOfCustomer());
                csvWriter.append(",");
                csvWriter.append(customer.getAddress());
                csvWriter.append("\n");
            }

            csvWriter.flush();
            csvWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readCSVToCustomer() {
        try {
            final String path = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\FuramaResort\\data\\customer.csv";

            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = br.readLine();

            while (line != null) {
                String[] data = line.split(",");
                Customer customer = new Customer(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8]);
                customers.add(customer);

                line = br.readLine();
            }
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void add(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void displayList() {
        System.out.printf("|%-15s|%-15s|%-15s|%-8s|%-18s|%-15s|%-20s|%-20s|%-15s|%n","Customer Code","Name","Date of Birth","Sex",
                "Identity Number","Phone Number","Email","Type of Customer","Address");
        for (Customer customer: customers) {
            System.out.printf("|%-15s|%-15s|%-15s|%-8s|%-18s|%-15s|%-20s|%-20s|%-15s|%n",customer.getPersonCode(),customer.getName(),customer.getDateOfBirth(),
                    customer.getSex(),customer.getIdentityNumber(),customer.getPhoneNumber(),customer.getEmail(),customer.getTypeOfCustomer(),customer.getAddress());
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
        dateOfBirth = validCustomer.validDateOfBirth(dateOfBirth);

        System.out.println("Enter your sex: ");
        String sex = sc.nextLine();

        System.out.println("Enter your identity number: ");
        String identityNumber = sc.nextLine();

        System.out.println("Enter your phone number: ");
        String phoneNumber = sc.nextLine();
        phoneNumber = validCustomer.validPhoneNumber(phoneNumber);

        System.out.println("Enter your mail: ");
        String email = sc.nextLine();
        email = validCustomer.validEmail(email);

        System.out.println("Enter your type of customer: ");
        String typeOfCustomer = sc.nextLine();
        typeOfCustomer = validCustomer.validTypeOfCustomer(typeOfCustomer);

        System.out.println("Enter your address: ");
        String address = sc.nextLine();

        Customer customer = new Customer(customerCode,name,dateOfBirth,sex,identityNumber,phoneNumber,email,typeOfCustomer,address);
        customers.add(customer);
    }

    @Override
    public void edit(String customerCode) {
        Customer customer = get(customerCode);

        while (customer == null) {
            System.out.println("Please check the employee code! Enter again: ");
            customerCode = sc.nextLine();
            customer = get(customerCode);
        }

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
                    newPhoneNumber = validCustomer.validPhoneNumber(newPhoneNumber);
                    customer.setPhoneNumber(newPhoneNumber);
                    break;

                case 3:
                    System.out.println("Enter new email: ");
                    String newEmail = sc.nextLine();
                    newEmail = validCustomer.validEmail(newEmail);
                    customer.setEmail(newEmail);
                    break;

                case 4:
                    System.out.println("Enter new type of customer: ");
                    String newTypeOfCustomer = sc.nextLine();
                    newTypeOfCustomer = validCustomer.validTypeOfCustomer(newTypeOfCustomer);
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
