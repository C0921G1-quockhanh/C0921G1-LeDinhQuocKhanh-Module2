package extra_assignement.models;

public class Intern extends Candidate {
    protected String major;
    protected String yearStudy;
    protected String universityName;

    public Intern() {
    }

    public Intern(int ID, String firstName, String lastName, int yearOfBirth, String address, String phone, String email, String candidateType, String major, String yearStudy, String universityName) {
        super(ID, firstName, lastName, yearOfBirth, address, phone, email, candidateType);
        this.major = major;
        this.yearStudy = yearStudy;
        this.universityName = universityName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getYearStudy() {
        return yearStudy;
    }

    public void setYearStudy(String yearStudy) {
        this.yearStudy = yearStudy;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", candidateType='" + candidateType + '\'' +
                ", major='" + major + '\'' +
                ", yearStudy='" + yearStudy + '\'' +
                ", universityName='" + universityName + '\'' +
                '}';
    }
}
