package FuramaResort.controllers;

import FuramaResort.models.Customer;
import FuramaResort.models.Employee;
import FuramaResort.services.CustomerServiceImpl;
import FuramaResort.services.EmployeeServiceImpl;

public class FuramaTesting {
    public static void main(String[] args) {
        Employee employee1 = new Employee("E001","Sterling","8/12/1994","male",
                "123123123","84-0123456789","sterling@gmail.com","University","Advisor",20000000);
        Employee employee2 = new Employee("E002","Rashford","31/10/1997","male",
                "123123456","84-0112223456","rashford@gmail.com","College","Receptionist",10000000);

        Customer customer1 = new Customer("C001","Kane","28/7/1993","male",
                "123456456","84-0123334567","kane@gmail.com","Platinum","England");
        Customer customer2 = new Customer("C002","Ronaldo","5/2/1985","male",
                "123456789","84-0771234567","ronaldo@gmail.com","Diamond","Portugal");

        FuramaController furamaController = new FuramaController();
        EmployeeServiceImpl employeeService = furamaController.getEmployeeService();
        CustomerServiceImpl customerService = furamaController.getCustomerService();


        employeeService.add(employee1);
        employeeService.add(employee2);

        customerService.add(customer1);
        customerService.add(customer2);

        furamaController.displayMainMenu();
    }
}
