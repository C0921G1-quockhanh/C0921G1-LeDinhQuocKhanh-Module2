package FuramaResort.controllers;

import FuramaResort.models.*;
import FuramaResort.services.CustomerServiceImpl;
import FuramaResort.services.EmployeeServiceImpl;
import FuramaResort.services.FacilityServiceImpl;

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

        Facility villa = new Villa("Villa-Beckham",300,10000000,10,
                "Day","high-quality",50,4);
        Facility house = new House("House-Salah",250,30000000,6,
                "Month","high-quality",3);
        Facility room = new Room("Room-Haaland",50,5000000,2,
                "Month","free-electricity");

        FuramaController furamaController = new FuramaController();
        EmployeeServiceImpl employeeService = furamaController.getEmployeeService();
        CustomerServiceImpl customerService = furamaController.getCustomerService();
        FacilityServiceImpl facilityService = furamaController.getFacilityService();

        employeeService.add(employee1);
        employeeService.add(employee2);

        customerService.add(customer1);
        customerService.add(customer2);

        facilityService.add(villa,5);
        facilityService.add(house,2);
        facilityService.add(room,5);

        furamaController.displayMainMenu();
    }
}
