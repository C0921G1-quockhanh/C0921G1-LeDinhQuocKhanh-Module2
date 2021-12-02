package FuramaResort.services;

import FuramaResort.models.Facility;
import FuramaResort.models.House;
import FuramaResort.models.Room;
import FuramaResort.models.Villa;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    Scanner sc = new Scanner(System.in);

    Map<Facility,Integer> facilities = new LinkedHashMap<>();
    ValidDataFacility validFacility = new ValidDataFacility();

    public void add(Facility facility, int numOfUse) {
        facilities.put(facility,numOfUse);
    }

    @Override
    public void displayList() {
        Set<Facility> keys = facilities.keySet();
        for (Facility key: keys) {
            System.out.println(key);
        }
    }

    @Override
    public void addNew() {
        int defaultNumOfUse = 0;

        System.out.println("Enter the name of service: ");
        String nameService = sc.nextLine();
        nameService = validFacility.validNameService(nameService);

        System.out.println("Enter the usable area: ");
        double usableArea = Double.parseDouble(sc.nextLine());
        usableArea = validFacility.validUsableArea(usableArea);

        System.out.println("Enter the rental cost: ");
        double rentalCost = Double.parseDouble(sc.nextLine());
        rentalCost = validFacility.validRentalCost(rentalCost);

        System.out.println("Enter the max number of people: ");
        int maxNumOfPeople = Integer.parseInt(sc.nextLine());
        maxNumOfPeople = validFacility.validMaxNumOfPeople(maxNumOfPeople);

        System.out.println("Enter the rental type: ");
        String rentalType = sc.nextLine();
        rentalType = validFacility.validRentalType(rentalType);

        System.out.println("Enter the type of facility you want to create: ");
        String facilityType = sc.nextLine();

        switch (facilityType) {
            case "Villa":
                System.out.println("Enter the standard of room in villa: ");
                String villaRoomStandard = sc.nextLine();

                System.out.println("Enter the pool area: ");
                double poolArea = Double.parseDouble(sc.nextLine());
                poolArea = validFacility.validPoolArea(poolArea);

                System.out.println("Enter the number of floors in villa: ");
                int numOfFloorsInVilla = Integer.parseInt(sc.nextLine());
                numOfFloorsInVilla = validFacility.validNumOfFloors(numOfFloorsInVilla);

                Facility villa = new Villa(nameService,usableArea,rentalCost,maxNumOfPeople,rentalType,villaRoomStandard,poolArea,numOfFloorsInVilla);
                facilities.put(villa,defaultNumOfUse);

                break;

            case "House":
                System.out.println("Enter the standard of room in house: ");
                String houseRoomStandard = sc.nextLine();

                System.out.println("Enter the number of floors in house: ");
                int numOfFloorsInHouse = Integer.parseInt(sc.nextLine());
                numOfFloorsInHouse = validFacility.validNumOfFloors(numOfFloorsInHouse);

                Facility house = new House(nameService,usableArea,rentalCost,maxNumOfPeople,rentalType,houseRoomStandard,numOfFloorsInHouse);
                facilities.put(house,defaultNumOfUse);

                break;

            case "Room":
                System.out.println("Enter free service you want: ");
                String freeService = sc.nextLine();

                Facility room = new Room(nameService,usableArea,rentalCost,maxNumOfPeople,rentalType,freeService);
                facilities.put(room,defaultNumOfUse);

                break;

            default:
                System.out.println("Please check your option!");
        }
    }

    @Override
    public void edit(String nonUse) {
    }

    @Override
    public void displayListFacilityMaintenance() {
        Set<Facility> keys = facilities.keySet();
        List<Facility> maintenanceFacilities = new ArrayList<>();

        for (Facility key: keys) {
            int numOfUse = facilities.get(key);

            if (numOfUse == 5)
                maintenanceFacilities.add(key);
        }

        for (Facility facility: maintenanceFacilities) {
            System.out.println(facility);
        }
    }
}
