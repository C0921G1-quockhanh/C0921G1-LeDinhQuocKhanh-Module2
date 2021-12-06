package FuramaResort.services.valid_data;

import java.util.Scanner;

public class ValidDataFacility {
    Scanner sc = new Scanner(System.in);

    public String validNameService(String nameService) {
        final String NAME_SERVICE_REGEX = "^SV(VL|HO|RO)-(\\d){4}$";

        while (!nameService.matches(NAME_SERVICE_REGEX)) {
            System.out.println("Please check the format of name service! Enter again: ");
            nameService = sc.nextLine();
        }

        return nameService;
    }

    public double validUsableArea(double usableArea) {
        while (usableArea <= 30) {
            System.out.println("Please check the usable area of the facility! Enter again: ");
            usableArea = Double.parseDouble(sc.nextLine());
        }

        return usableArea;
    }

    public double validPoolArea(double poolArea) {
        while (poolArea <= 30) {
            System.out.println("Please check the area of the pool! Enter again: ");
            poolArea = Double.parseDouble(sc.nextLine());
        }

        return poolArea;
    }

    public double validRentalCost(double rentalCost) {
        while (rentalCost <= 0) {
            System.out.println("Please check the rental cost! Enter again: ");
            rentalCost = Double.parseDouble(sc.nextLine());
        }

        return rentalCost;
    }

    public int validMaxNumOfPeople(int maxNumOfPeople) {
        while (maxNumOfPeople <= 0 || maxNumOfPeople >= 20) {
            System.out.println("Please check the max number of people! Enter again: ");
            maxNumOfPeople = Integer.parseInt(sc.nextLine());
        }

        return maxNumOfPeople;
    }

    public int validNumOfFloors(int numOfFloors) {
        while (numOfFloors <= 0) {
            System.out.println("Please check the number of floors! Enter again: ");
            numOfFloors = Integer.parseInt(sc.nextLine());
        }

        return numOfFloors;
    }

    public String validRentalType(String rentalType) {
        boolean checkType = rentalType.equals("Year") || rentalType.equals("Month") || rentalType.equals("Day");

        while (!checkType) {
            System.out.println("Please check the rental type! Enter again: ");
            rentalType = sc.nextLine();
            checkType = rentalType.equals("Year") || rentalType.equals("Month") || rentalType.equals("Day");
        }

        return rentalType;
    }
}
