package final_exam.models;

public class HandPhone extends Phone{
    protected String country;
    protected String repairStatus;

    public HandPhone() {
    }

    public HandPhone(int phoneID, String phoneName, double price, int quantity, String manufacturer, String country, String repairStatus) {
        super(phoneID, phoneName, price, quantity, manufacturer);
        this.country = country;
        this.repairStatus = repairStatus;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRepairStatus() {
        return repairStatus;
    }

    public void setRepairStatus(String repairStatus) {
        this.repairStatus = repairStatus;
    }

    @Override
    public String toString() {
        return "HandPhone{" +
                "phoneID=" + phoneID +
                ", phoneName='" + phoneName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", manufacturer='" + manufacturer + '\'' +
                ", country='" + country + '\'' +
                ", repairStatus='" + repairStatus + '\'' +
                '}';
    }
}
