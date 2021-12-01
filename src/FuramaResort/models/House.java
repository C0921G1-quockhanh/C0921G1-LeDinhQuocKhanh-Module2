package FuramaResort.models;

public class House extends Facility {
    protected String houseRoomStandard;
    protected int numOfFloorsInHouse;

    public House() {
    }

    public House(String nameService, double usableArea, double rentalCost, int maxNumOfPeople, String rentalType, String houseRoomStandard, int numOfFloorsInHouse) {
        super(nameService, usableArea, rentalCost, maxNumOfPeople, rentalType);
        this.houseRoomStandard = houseRoomStandard;
        this.numOfFloorsInHouse = numOfFloorsInHouse;
    }

    public String getHouseRoomStandard() {
        return houseRoomStandard;
    }

    public void setHouseRoomStandard(String houseRoomStandard) {
        this.houseRoomStandard = houseRoomStandard;
    }

    public int getNumOfFloorsInHouse() {
        return numOfFloorsInHouse;
    }

    public void setNumOfFloorsInHouse(int numOfFloorsInHouse) {
        this.numOfFloorsInHouse = numOfFloorsInHouse;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseRoomStandard='" + houseRoomStandard + '\'' +
                ", numOfFloorsInHouse=" + numOfFloorsInHouse +
                ", nameService='" + nameService + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxNumOfPeople=" + maxNumOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
