package final_exam.services;

import java.util.Scanner;

public class ValidData {
    Scanner sc = new Scanner(System.in);

    public double validPrice(double price) {
        while (price <= 0) {
            System.out.println("Please check the price of the phone! Enter again: ");
            price = Double.parseDouble(sc.nextLine());
        }

        return price;
    }

    public int validQuantity(int quantity) {
        while (quantity <= 0) {
            System.out.println("Please check the quantity of the phone! Enter again: ");
            quantity = Integer.parseInt(sc.nextLine());
        }

        return quantity;
    }

    public int validWarrantyPeriod(int warrantyPeriod) {
        while (warrantyPeriod <= 0 || warrantyPeriod > 730) {
            System.out.println("Please check the warranty period! Enter again: ");
            warrantyPeriod = Integer.parseInt(sc.nextLine());
        }

        return warrantyPeriod;
    }

    public String validWarrantyZone(String warrantyZone) {
        while (!warrantyZone.equals("National") && !warrantyZone.equals("International")) {
            System.out.println("Please check the warranty zone! Enter again: ");
            warrantyZone = sc.nextLine();
        }

        return warrantyZone;
    }

    public String validCountry(String country) {
        while (country.equals("VietNam")) {
            System.out.println("Please check the country! Enter again: ");
            country = sc.nextLine();
        }

        return country;
    }

    public String validRepairStatus(String repairStatus) {
        while (!repairStatus.equals("Repaired") && !repairStatus.equals("Non-Repaired")) {
            System.out.println("Please check the repair status! Enter again: ");
            repairStatus = sc.nextLine();
        }

        return repairStatus;
    }
}
