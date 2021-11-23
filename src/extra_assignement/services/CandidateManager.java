package extra_assignement.services;

import extra_assignement.models.Candidate;
import extra_assignement.models.Experience;
import extra_assignement.models.Fresher;
import extra_assignement.models.Intern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateManager implements CandidateService {
    Scanner sc = new Scanner(System.in);

    ValidData validData = new ValidData();

    private List<Candidate> candidateList;

    public CandidateManager() {
        candidateList = new ArrayList<>();
    }

    public List<Candidate> getCandidateList() {
        return candidateList;
    }

    public void setCandidateList(List<Candidate> candidateList) {
        this.candidateList = candidateList;
    }

    @Override
    public void createCandidate(String candidateType) {
        System.out.println("Enter the ID of candidate: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the first name of candidate: ");
        String firstName = sc.nextLine();

        System.out.println("Enter the last name of candidate: ");
        String lastName = sc.nextLine();

        System.out.println("Enter the year of birth: ");
        int yearOfBirth = Integer.parseInt(sc.nextLine());
        validData.validYearOfBirth(yearOfBirth);

        System.out.println("Enter the address of candidate: ");
        String address = sc.nextLine();

        System.out.println("Enter the phone number of candidate: ");
        String phone = sc.nextLine();
        validData.validPhoneNumber(phone);

        System.out.println("Enter the email of candidate: ");
        String email = sc.nextLine();
        validData.validEmail(email);

        switch (candidateType) {
            case "Experience":
                System.out.println("Enter the year of experience: ");
                int yearOfExperience = Integer.parseInt(sc.nextLine());
                validData.validYearOfExperience(yearOfExperience);

                System.out.println("Enter the skill of candidate: ");
                String professionalSkill = sc.nextLine();

                Candidate experience = new Experience(id,firstName,lastName,yearOfBirth,address,
                        phone,email,candidateType,yearOfExperience,professionalSkill);

                candidateList.add(experience);
                break;

            case "Fresher":
                System.out.println("Enter the year of graduation: ");
                int graduatedTime = Integer.parseInt(sc.nextLine());

                System.out.println("Enter the rank of graduation: ");
                String rankOfGraduation = sc.nextLine();
                validData.validRankOfGraduation(rankOfGraduation);

                System.out.println("Enter the name of university where candidate graduated: ");
                String universityGraduated = sc.nextLine();

                Candidate fresher = new Fresher(id,firstName,lastName,yearOfBirth,address,
                        phone,email,candidateType,graduatedTime,rankOfGraduation,universityGraduated);

                candidateList.add(fresher);
                break;

            case "Intern":
                System.out.println("Enter the major of candidate: ");
                String major = sc.nextLine();

                System.out.println("Enter the year of study: ");
                String yearStudy = sc.nextLine();

                System.out.println("Enter the name of university where candidate is studying: ");
                String universityName = sc.nextLine();

                Candidate intern = new Intern(id,firstName,lastName,yearOfBirth,address,
                        phone,email,candidateType,major,yearStudy,universityName);

                candidateList.add(intern);
                break;

            default:
                System.out.println("Please check the candidate type");
        }
    }

    @Override
    public Candidate searchCandidate(int id, String candidateType) {
        boolean checkCandidate = false;
        int index = 0;

        for (int i = 0; i < candidateList.size(); i++) {
            Candidate candidate = candidateList.get(i);

            if (candidate.getID() == id && candidate.getCandidateType().equals(candidateType)) {
                checkCandidate = true;
                index = i;
                break;
            }
        }

        if (checkCandidate)
            return candidateList.get(index);
        else
            return null;
    }

    @Override
    public Candidate deleteCandidate(int id, String candidateType) {
        boolean checkCandidate = false;
        int index = 0;

        for (int i = 0; i < candidateList.size(); i++) {
            Candidate candidate = candidateList.get(i);

            if (candidate.getID() == id && candidate.getCandidateType().equals(candidateType)) {
                checkCandidate = true;
                index = i;
                break;
            }
        }

        if (checkCandidate)
            return candidateList.remove(index);
        else
            return null;
    }

    @Override
    public void displayAllCandidates() {
        for (Candidate candidate: candidateList) {
            System.out.println(candidate);
        }
    }
}
