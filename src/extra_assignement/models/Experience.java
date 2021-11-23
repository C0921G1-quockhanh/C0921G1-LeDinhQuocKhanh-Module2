package extra_assignement.models;

public class Experience extends Candidate {
    protected int yearOfExperience;
    protected String professionalSkill;

    public Experience() {
    }

    public Experience(int ID, String firstName, String lastName, int yearOfBirth, String address, String phone, String email, String candidateType, int yearOfExperience, String professionalSkill) {
        super(ID, firstName, lastName, yearOfBirth, address, phone, email, candidateType);
        this.yearOfExperience = yearOfExperience;
        this.professionalSkill = professionalSkill;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getProfessionalSkill() {
        return professionalSkill;
    }

    public void setProfessionalSkill(String professionalSkill) {
        this.professionalSkill = professionalSkill;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", candidateType='" + candidateType + '\'' +
                ", yearOfExperience=" + yearOfExperience +
                ", professionalSkill='" + professionalSkill + '\'' +
                '}';
    }
}
