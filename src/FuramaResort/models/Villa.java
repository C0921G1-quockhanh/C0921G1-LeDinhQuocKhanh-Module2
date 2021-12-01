package FuramaResort.models;

public class Villa extends Facility {
    protected String villaRoomStandard;
    protected double poolArea;
    protected int numOfFloorsInVilla;

    public Villa() {
    }

    public Villa(String nameService, double usableArea, double rentalCost, int maxNumOfPeople, String rentalType, String villaRoomStandard, double poolArea, int numOfFloorsInVilla) {
        super(nameService, usableArea, rentalCost, maxNumOfPeople, rentalType);
        this.villaRoomStandard = villaRoomStandard;
        this.poolArea = poolArea;
        this.numOfFloorsInVilla = numOfFloorsInVilla;
    }

    public String getVillaRoomStandard() {
        return villaRoomStandard;
    }

    public void setVillaRoomStandard(String villaRoomStandard) {
        this.villaRoomStandard = villaRoomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumOfFloorsInVilla() {
        return numOfFloorsInVilla;
    }

    public void setNumOfFloorsInVilla(int numOfFloorsInVilla) {
        this.numOfFloorsInVilla = numOfFloorsInVilla;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "villaRoomStandard='" + villaRoomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numOfFloorsInVilla=" + numOfFloorsInVilla +
                ", nameService='" + nameService + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxNumOfPeople=" + maxNumOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
