package FuramaResort.models;

public class Contract {
    protected String contractID;
    protected String bookingCode;
    protected double deposit;
    protected double totalPayment;
    protected String customerCode;

    public Contract() {
    }

    public Contract(String contractID, String bookingCode, double deposit, double totalPayment, String customerCode) {
        this.contractID = contractID;
        this.bookingCode = bookingCode;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
        this.customerCode = customerCode;
    }

    public String getContractID() {
        return contractID;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractID='" + contractID + '\'' +
                ", bookingCode='" + bookingCode + '\'' +
                ", deposit=" + deposit +
                ", totalPayment=" + totalPayment +
                ", customerCode='" + customerCode + '\'' +
                '}';
    }
}
