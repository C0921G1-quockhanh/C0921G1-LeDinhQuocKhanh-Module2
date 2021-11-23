package extra_assignement.models;

public class Fresher extends Candidate {
    protected int graduatedTime;
    protected String rankOfGraduation;
    protected String universityGraduated;

    public Fresher() {
    }

    public Fresher(int ID, String firstName, String lastName, int yearOfBirth, String address, String phone, String email, String candidateType, int graduatedTime, String rankOfGraduation, String universityGraduated) {
        super(ID, firstName, lastName, yearOfBirth, address, phone, email, candidateType);
        this.graduatedTime = graduatedTime;
        this.rankOfGraduation = rankOfGraduation;
        this.universityGraduated = universityGraduated;
    }

    public int getGraduatedTime() {
        return graduatedTime;
    }

    public void setGraduatedTime(int graduatedTime) {
        this.graduatedTime = graduatedTime;
    }

    public String getRankOfGraduation() {
        return rankOfGraduation;
    }

    public void setRankOfGraduation(String rankOfGraduation) {
        this.rankOfGraduation = rankOfGraduation;
    }

    public String getUniversityGraduated() {
        return universityGraduated;
    }

    public void setUniversityGraduated(String universityGraduated) {
        this.universityGraduated = universityGraduated;
    }

    @Override
    public String toString() {
        return "Fresher{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", candidateType='" + candidateType + '\'' +
                ", graduatedTime=" + graduatedTime +
                ", rankOfGraduation='" + rankOfGraduation + '\'' +
                ", universityGraduated='" + universityGraduated + '\'' +
                '}';
    }
}
