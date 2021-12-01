package FuramaResort.models;

public class Room extends Facility {
    protected String freeService;

    public Room() {
    }

    public Room(String nameService, double usableArea, double rentalCost, int maxNumOfPeople, String rentalType, String freeService) {
        super(nameService, usableArea, rentalCost, maxNumOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxNumOfPeople=" + maxNumOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
