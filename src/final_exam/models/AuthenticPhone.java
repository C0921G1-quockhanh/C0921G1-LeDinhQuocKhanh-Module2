package final_exam.models;

public class AuthenticPhone extends Phone {
    protected int warrantyPeriod;
    protected String warrantyZone;

    public AuthenticPhone() {
    }

    public AuthenticPhone(int phoneID, String phoneName, double price, int quantity, String manufacturer, int warrantyPeriod, String warrantyZone) {
        super(phoneID, phoneName, price, quantity, manufacturer);
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyZone = warrantyZone;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyZone() {
        return warrantyZone;
    }

    public void setWarrantyZone(String warrantyZone) {
        this.warrantyZone = warrantyZone;
    }

    @Override
    public String toString() {
        return "AuthenticPhone{" +
                "phoneID=" + phoneID +
                ", phoneName='" + phoneName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", manufacturer='" + manufacturer + '\'' +
                ", warrantyPeriod=" + warrantyPeriod +
                ", warrantyZone='" + warrantyZone + '\'' +
                '}';
    }
}
