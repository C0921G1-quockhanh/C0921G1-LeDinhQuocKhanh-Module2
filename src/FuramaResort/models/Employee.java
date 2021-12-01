package FuramaResort.models;

public class Employee extends Person {
    protected String qualification;
    protected String workingPosition;
    protected double salary;

    public Employee() {
    }

    public Employee(String personCode, String name, String dateOfBirth, String sex, String identityNumber, String phoneNumber, String email, String qualification, String workingPosition, double salary) {
        super(personCode, name, dateOfBirth, sex, identityNumber, phoneNumber, email);
        this.qualification = qualification;
        this.workingPosition = workingPosition;
        this.salary = salary;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getWorkingPosition() {
        return workingPosition;
    }

    public void setWorkingPosition(String workingPosition) {
        this.workingPosition = workingPosition;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "personCode='" + personCode + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", sex='" + sex + '\'' +
                ", identityNumber='" + identityNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", qualification='" + qualification + '\'' +
                ", workingPosition='" + workingPosition + '\'' +
                ", salary=" + salary +
                '}';
    }
}
