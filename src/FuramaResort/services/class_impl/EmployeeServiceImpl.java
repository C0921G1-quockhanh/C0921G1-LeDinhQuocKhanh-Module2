package FuramaResort.services.class_impl;

import FuramaResort.models.Employee;
import FuramaResort.services.valid_data.ValidDataPerson;
import FuramaResort.services.interfaces.EmployeeService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    Scanner sc = new Scanner(System.in);

    List<Employee> employees;

    ValidDataPerson validEmployee = new ValidDataPerson();

    public static List<Employee> dataEmployee = new ArrayList<>();

    static {
        Employee employee1 = new Employee("E001","Sterling","08/12/1994","male",
                "123123123","84-0123456789","sterling@gmail.com","University","Advisor",20000000);
        Employee employee2 = new Employee("E002","Rashford","31/10/1997","male",
                "123123456","84-0112223456","rashford@gmail.com","College","Receptionist",10000000);
        Employee employee3 = new Employee("E003","Thiago","11/04/1991","male",
                "111222333","84-0111444555","thiago@gmail.com","Intermediate","Service Staff",5000000);
        Employee employee4 = new Employee("E004","Joe Hart","19/04/1987","male",
                "111888999","84-0111555666","hart@gmail.com","Postgraduate","President",40000000);

        dataEmployee.add(employee1);
        dataEmployee.add(employee2);
        dataEmployee.add(employee3);
        dataEmployee.add(employee4);
    }

    public EmployeeServiceImpl() {
        try {
            final String path = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\FuramaResort\\data\\employee.csv";
            File file = new File(path);
            if (!file.exists()) {
                employees = dataEmployee;
            } else {
                employees = new ArrayList<>();
                readCSVToEmployee();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void writeEmployeeToCSV() {
        try {
            final String path = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\FuramaResort\\data\\employee.csv";
            FileWriter csvWriter = new FileWriter(path);

            for (Employee employee: employees) {
                csvWriter.append(employee.getPersonCode());
                csvWriter.append(",");
                csvWriter.append(employee.getName());
                csvWriter.append(",");
                csvWriter.append(employee.getDateOfBirth());
                csvWriter.append(",");
                csvWriter.append(employee.getSex());
                csvWriter.append(",");
                csvWriter.append(employee.getIdentityNumber());
                csvWriter.append(",");
                csvWriter.append(employee.getPhoneNumber());
                csvWriter.append(",");
                csvWriter.append(employee.getEmail());
                csvWriter.append(",");
                csvWriter.append(employee.getQualification());
                csvWriter.append(",");
                csvWriter.append(employee.getWorkingPosition());
                csvWriter.append(",");
                csvWriter.append("" + employee.getSalary());
                csvWriter.append("\n");
            }

            csvWriter.flush();
            csvWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readCSVToEmployee() {
        try {
            final String path = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\FuramaResort\\data\\employee.csv";

            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = br.readLine();

            while (line != null) {
                String[] data = line.split(",");
                Employee employee = new Employee(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],Double.parseDouble(data[9]));
                employees.add(employee);

                line = br.readLine();
            }
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void displayList() {
        System.out.printf("|%-15s|%-15s|%-15s|%-8s|%-18s|%-15s|%-20s|%-15s|%-20s|%-10s|%n","Employee Code","Name","Date of Birth","Sex",
                "Identity Number","Phone Number","Email","Qualification","Working Position","Salary");
        for (Employee employee: employees) {
            System.out.printf("|%-15s|%-15s|%-15s|%-8s|%-18s|%-15s|%-20s|%-15s|%-20s|%-10.0f|%n",employee.getPersonCode(),employee.getName(),employee.getDateOfBirth(),
                    employee.getSex(),employee.getIdentityNumber(),employee.getPhoneNumber(),employee.getEmail(),employee.getQualification(),
                    employee.getWorkingPosition(),employee.getSalary());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Enter your employee code: ");
        String employeeCode = sc.nextLine();

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your date of birth: ");
        String dateOfBirth = sc.nextLine();
        dateOfBirth = validEmployee.validDateOfBirth(dateOfBirth);

        System.out.println("Enter your sex: ");
        String sex = sc.nextLine();

        System.out.println("Enter your identity number: ");
        String identityNumber = sc.nextLine();

        System.out.println("Enter your phone number: ");
        String phoneNumber = sc.nextLine();
        phoneNumber = validEmployee.validPhoneNumber(phoneNumber);

        System.out.println("Enter your mail: ");
        String email = sc.nextLine();
        email = validEmployee.validEmail(email);

        System.out.println("Enter your academic level: ");
        String qualification = sc.nextLine();
        qualification = validEmployee.validQualification(qualification);

        System.out.println("Enter your working position: ");
        String workingPosition = sc.nextLine();
        workingPosition = validEmployee.validWorkingPosition(workingPosition);

        System.out.println("Enter your salary: ");
        double salary = Double.parseDouble(sc.nextLine());

        Employee employee = new Employee(employeeCode,name,dateOfBirth,sex,identityNumber,phoneNumber,email,qualification,workingPosition,salary);
        employees.add(employee);
    }

    @Override
    public void edit(String employeeCode) {
        Employee employee = get(employeeCode);

        while (employee == null) {
            System.out.println("Please check the employee code! Enter again: ");
            employeeCode = sc.nextLine();
            employee = get(employeeCode);
        }

        int choice = -1;

        while (choice !=0) {
            System.out.println("EDITING INFORMATION: ");
            System.out.println("1.\tEdit identity number");
            System.out.println("2.\tEdit phone number");
            System.out.println("3.\tEdit email");
            System.out.println("4.\tEdit qualification");
            System.out.println("5.\tEdit working position");
            System.out.println("6.\tEdit salary");
            System.out.println("0.\tExit");

            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter new identity number: ");
                    String newIdentityNumber = sc.nextLine();
                    employee.setIdentityNumber(newIdentityNumber);
                    break;

                case 2:
                    System.out.println("Enter new phone number: ");
                    String newPhoneNumber = sc.nextLine();
                    newPhoneNumber = validEmployee.validPhoneNumber(newPhoneNumber);
                    employee.setPhoneNumber(newPhoneNumber);
                    break;

                case 3:
                    System.out.println("Enter new email: ");
                    String newEmail = sc.nextLine();
                    newEmail = validEmployee.validEmail(newEmail);
                    employee.setEmail(newEmail);
                    break;

                case 4:
                    System.out.println("Enter new qualification: ");
                    String newQualification = sc.nextLine();
                    newQualification = validEmployee.validQualification(newQualification);
                    employee.setQualification(newQualification);
                    break;

                case 5:
                    System.out.println("Enter new working position: ");
                    String newWorkingPosition = sc.nextLine();
                    newWorkingPosition = validEmployee.validWorkingPosition(newWorkingPosition);
                    employee.setWorkingPosition(newWorkingPosition);
                    break;

                case 6:
                    System.out.println("Enter new salary: ");
                    double newSalary = Double.parseDouble(sc.nextLine());
                    employee.setSalary(newSalary);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Please check your option!");
            }

        }
    }

    public Employee get(String employeeCode) {
        boolean checkEmployee = false;
        int index = 0;

        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            String personCode = employee.getPersonCode();

            if (personCode.equals(employeeCode)) {
                checkEmployee = true;
                index = i;
                break;
            }
        }

        if (checkEmployee)
            return employees.get(index);
        else
            return null;
    }
}
