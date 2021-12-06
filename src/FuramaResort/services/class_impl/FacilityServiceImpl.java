package FuramaResort.services.class_impl;

import FuramaResort.models.Facility;
import FuramaResort.models.House;
import FuramaResort.models.Room;
import FuramaResort.models.Villa;
import FuramaResort.services.valid_data.ValidDataFacility;
import FuramaResort.services.interfaces.FacilityService;

import java.io.*;
import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    Scanner sc = new Scanner(System.in);

    Map<Facility,Integer> facilities;

    ValidDataFacility validFacility = new ValidDataFacility();

    public static Map<Facility,Integer> dataFacility = new LinkedHashMap<>();

    static {
        Facility villa1 = new Villa("SVVL-0001",300,10000000,10,
                "Day","high-quality",50,4);
        Facility villa2 = new Villa("SVVL-0002",400,15000000,12,
                "Day","high-quality",80,5);
        Facility villa3 = new Villa("SVVL-0003",200,8000000,8,
                "Day","medium-quality",40,3);

        Facility house1 = new House("SVHO-0001",250,30000000,6,
                "Month","high-quality",3);
        Facility house2 = new House("SVHO-0002",350,40000000,8,
                "Month","high-quality",4);
        Facility house3 = new House("SVHO-0003",200,20000000,6,
                "Month","medium-quality",3);

        Facility room1 = new Room("SVRO-0001",50,5000000,2,
                "Month","free-electricity");
        Facility room2 = new Room("SVRO-0002",70,7000000,2,
                "Month","free-electricity");
        Facility room3 = new Room("SVRO-0003",40,4000000,2,
                "Month","nothing");

        dataFacility.put(villa1,0);
        dataFacility.put(villa2,2);
        dataFacility.put(villa3,4);

        dataFacility.put(house1,2);
        dataFacility.put(house2,0);
        dataFacility.put(house3,0);

        dataFacility.put(room1,0);
        dataFacility.put(room2,5);
        dataFacility.put(room3,0);
    }

    public FacilityServiceImpl() {
        try {
            final String villaPath = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\FuramaResort\\data\\villa.csv";
            final String housePath = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\FuramaResort\\data\\house.csv";
            final String roomPath = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\FuramaResort\\data\\room.csv";

            File villaFile = new File(villaPath);
            File houseFile = new File(housePath);
            File roomFile = new File(roomPath);

            if (!villaFile.exists() || !houseFile.exists() || !roomFile.exists())
                facilities = dataFacility;
            else {
                facilities = new LinkedHashMap<>();
                readCSVToVilla();
                readCSVToHouse();
                readCSVToRoom();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Map<Facility, Integer> getFacilities() {
        return facilities;
    }

    public Facility get(String nameService) {
        Set<Facility> keys = facilities.keySet();

        for (Facility key: keys) {
            if (nameService.equals(key.getNameService())) {
                return key;
            }
        }

        return null;
    }

    public void writeVillaToCSV() {
        try {
            final String path = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\FuramaResort\\data\\villa.csv";
            FileWriter csvWriter = new FileWriter(path);

            Set<Facility> keys = facilities.keySet();
            for (Facility key: keys) {
                if (key instanceof Villa) {
                    csvWriter.append(key.getNameService());
                    csvWriter.append(",");
                    csvWriter.append("" + key.getUsableArea());
                    csvWriter.append(",");
                    csvWriter.append("" + key.getRentalCost());
                    csvWriter.append(",");
                    csvWriter.append("" + key.getMaxNumOfPeople());
                    csvWriter.append(",");
                    csvWriter.append(key.getRentalType());
                    csvWriter.append(",");
                    csvWriter.append(((Villa) key).getVillaRoomStandard());
                    csvWriter.append(",");
                    csvWriter.append("" + ((Villa) key).getPoolArea());
                    csvWriter.append(",");
                    csvWriter.append("" + ((Villa) key).getNumOfFloorsInVilla());
                    csvWriter.append(",");
                    csvWriter.append("" + facilities.get(key));
                    csvWriter.append("\n");
                }
            }

            csvWriter.flush();
            csvWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readCSVToVilla() {
        try {
            final String path = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\FuramaResort\\data\\villa.csv";

            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = br.readLine();

            while (line != null) {
                String[] data = line.split(",");
                Facility villa = new Villa(data[0],Double.parseDouble(data[1]),Double.parseDouble(data[2]),Integer.parseInt(data[3]),
                        data[4],data[5],Double.parseDouble(data[6]),Integer.parseInt(data[7]));
                facilities.put(villa,Integer.parseInt(data[8]));

                line = br.readLine();
            }
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeHouseToCSV() {
        try {
            final String path = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\FuramaResort\\data\\house.csv";
            FileWriter csvWriter = new FileWriter(path);

            Set<Facility> keys = facilities.keySet();
            for (Facility key: keys) {
                if (key instanceof House) {
                    csvWriter.append(key.getNameService());
                    csvWriter.append(",");
                    csvWriter.append("" + key.getUsableArea());
                    csvWriter.append(",");
                    csvWriter.append("" + key.getRentalCost());
                    csvWriter.append(",");
                    csvWriter.append("" + key.getMaxNumOfPeople());
                    csvWriter.append(",");
                    csvWriter.append(key.getRentalType());
                    csvWriter.append(",");
                    csvWriter.append(((House) key).getHouseRoomStandard());
                    csvWriter.append(",");
                    csvWriter.append("" + ((House) key).getNumOfFloorsInHouse());
                    csvWriter.append(",");
                    csvWriter.append("" + facilities.get(key));
                    csvWriter.append("\n");
                }
            }

            csvWriter.flush();
            csvWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readCSVToHouse() {
        try {
            final String path = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\FuramaResort\\data\\house.csv";

            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = br.readLine();

            while (line != null) {
                String[] data = line.split(",");
                Facility house = new House(data[0],Double.parseDouble(data[1]),Double.parseDouble(data[2]),Integer.parseInt(data[3]),
                        data[4],data[5],Integer.parseInt(data[6]));
                facilities.put(house,Integer.parseInt(data[7]));

                line = br.readLine();
            }
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeRoomToCSV() {
        try {
            final String path = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\FuramaResort\\data\\room.csv";
            FileWriter csvWriter = new FileWriter(path);

            Set<Facility> keys = facilities.keySet();
            for (Facility key: keys) {
                if (key instanceof Room) {
                    csvWriter.append(key.getNameService());
                    csvWriter.append(",");
                    csvWriter.append("" + key.getUsableArea());
                    csvWriter.append(",");
                    csvWriter.append("" + key.getRentalCost());
                    csvWriter.append(",");
                    csvWriter.append("" + key.getMaxNumOfPeople());
                    csvWriter.append(",");
                    csvWriter.append(key.getRentalType());
                    csvWriter.append(",");
                    csvWriter.append(((Room) key).getFreeService());
                    csvWriter.append(",");
                    csvWriter.append("" + facilities.get(key));
                    csvWriter.append("\n");
                }
            }

            csvWriter.flush();
            csvWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readCSVToRoom() {
        try {
            final String path = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\FuramaResort\\data\\room.csv";

            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = br.readLine();

            while (line != null) {
                String[] data = line.split(",");
                Facility room = new Room(data[0],Double.parseDouble(data[1]),Double.parseDouble(data[2]),Integer.parseInt(data[3]),
                        data[4],data[5]);
                facilities.put(room,Integer.parseInt(data[6]));

                line = br.readLine();
            }
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void add(Facility facility, int numOfUse) {
        facilities.put(facility,numOfUse);
    }

    @Override
    public void displayList() {
        displayVilla();
        System.out.println("---------------------------------");
        displayHouse();
        System.out.println("---------------------------------");
        displayRoom();
    }

    public void displayVilla() {
        System.out.printf("|%-15s|%-15s|%-15s|%-25s|%-15s|%-25s|%-20s|%-20s|%-15s|%n","Name Service","Usable Area","Rental Cost","Max Number of People",
                "Rental Type","Villa Room Standard","The Number of Use","Floors in Villa","Pool Area");

        Set<Facility> keys = facilities.keySet();
        for (Facility key: keys) {
            if (key instanceof Villa) {
                System.out.printf("|%-15s|%-15.0f|%-15.0f|%-25d|%-15s|%-25s|%-20d|%-20d|%-15.0f|%n",key.getNameService(),key.getUsableArea(),key.getRentalCost(),
                        key.getMaxNumOfPeople(),key.getRentalType(),((Villa) key).getVillaRoomStandard(),facilities.get(key),
                        ((Villa) key).getNumOfFloorsInVilla(),((Villa) key).getPoolArea());
            }
        }
    }

    public void displayHouse() {
        System.out.printf("|%-15s|%-15s|%-15s|%-25s|%-15s|%-25s|%-20s|%-20s|%n","Name Service","Usable Area","Rental Cost","Max Number of People",
                "Rental Type","House Room Standard","The Number of Use","Floors in House");

        Set<Facility> keys = facilities.keySet();
        for (Facility key: keys) {
            if (key instanceof House) {
                System.out.printf("|%-15s|%-15.0f|%-15.0f|%-25d|%-15s|%-25s|%-20d|%-20d|%n",key.getNameService(),key.getUsableArea(),key.getRentalCost(),
                        key.getMaxNumOfPeople(),key.getRentalType(),((House) key).getHouseRoomStandard(),facilities.get(key),
                        ((House) key).getNumOfFloorsInHouse());
            }
        }
    }

    public void displayRoom() {
        System.out.printf("|%-15s|%-15s|%-15s|%-25s|%-15s|%-25s|%-20s|%n","Name Service","Usable Area","Rental Cost","Max Number of People",
                "Rental Type","Free Service","The Number of Use");

        Set<Facility> keys = facilities.keySet();
        for (Facility key: keys) {
            if (key instanceof Room) {
                System.out.printf("|%-15s|%-15.0f|%-15.0f|%-25d|%-15s|%-25s|%-20d|%n",key.getNameService(),key.getUsableArea(),key.getRentalCost(),
                        key.getMaxNumOfPeople(),key.getRentalType(),((Room) key).getFreeService(),facilities.get(key));
            }
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
            if (facility instanceof Villa)
                System.out.printf("|%-15s|%-15.0f|%-15.0f|%-25d|%-15s|%-25s|%-20d|%-15.0f|%n",facility.getNameService(),facility.getUsableArea(),
                        facility.getRentalCost(),facility.getMaxNumOfPeople(),facility.getRentalType(),((Villa) facility).getVillaRoomStandard(),
                        ((Villa) facility).getNumOfFloorsInVilla(),((Villa) facility).getPoolArea());
            else if (facility instanceof House)
                System.out.printf("|%-15s|%-15.0f|%-15.0f|%-25d|%-15s|%-25s|%-20d|%n",facility.getNameService(),facility.getUsableArea(),facility.getRentalCost(),
                        facility.getMaxNumOfPeople(),facility.getRentalType(),((House) facility).getHouseRoomStandard(), ((House) facility).getNumOfFloorsInHouse());
            else
                System.out.printf("|%-15s|%-15.0f|%-15.0f|%-25d|%-15s|%-25s|%n",facility.getNameService(),facility.getUsableArea(),facility.getRentalCost(),
                        facility.getMaxNumOfPeople(),facility.getRentalType(),((Room) facility).getFreeService());
        }
    }
}
