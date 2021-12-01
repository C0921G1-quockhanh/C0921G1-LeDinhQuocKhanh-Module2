package FuramaResort.services;

import FuramaResort.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    Scanner sc = new Scanner(System.in);

    List<Employee> employees = new ArrayList<>();

    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void displayList() {
        for (Employee employee: employees) {
            System.out.println(employee);
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

        System.out.println("Enter your sex: ");
        String sex = sc.nextLine();

        System.out.println("Enter your identity number: ");
        String identityNumber = sc.nextLine();

        System.out.println("Enter your phone number: ");
        String phoneNumber = sc.nextLine();

        System.out.println("Enter your mail: ");
        String email = sc.nextLine();

        System.out.println("Enter your academic level: ");
        String qualification = sc.nextLine();

        System.out.println("Enter your working position: ");
        String workingPosition = sc.nextLine();

        System.out.println("Enter your salary: ");
        double salary = Double.parseDouble(sc.nextLine());

        Employee employee = new Employee(employeeCode,name,dateOfBirth,sex,identityNumber,phoneNumber,email,qualification,workingPosition,salary);
        employees.add(employee);
    }

    @Override
    public void edit(String employeeCode) {
        Employee employee = get(employeeCode);

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
                    employee.setPhoneNumber(newPhoneNumber);
                    break;

                case 3:
                    System.out.println("Enter new email: ");
                    String newEmail = sc.nextLine();
                    employee.setEmail(newEmail);
                    break;

                case 4:
                    System.out.println("Enter new qualification: ");
                    String newQualification = sc.nextLine();
                    employee.setQualification(newQualification);
                    break;

                case 5:
                    System.out.println("Enter new working position: ");
                    String newWorkingPosition = sc.nextLine();
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
