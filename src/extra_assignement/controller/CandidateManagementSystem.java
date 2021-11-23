package extra_assignement.controller;

import extra_assignement.models.Candidate;
import extra_assignement.services.CandidateManager;

import java.util.Scanner;

public class CandidateManagementSystem {
    Scanner sc = new Scanner(System.in);

    CandidateManager candidateManager;
    int choice = -1;

    public CandidateManagementSystem() {
    }

    public CandidateManagementSystem(CandidateManager candidateManager) {
        this.candidateManager = candidateManager;
    }

    public void displaySystem() {
        while (choice != 0) {
            System.out.println("Candidate Management System: ");
            System.out.println("1. Creating experience candidate");
            System.out.println("2. Creating fresher candidate");
            System.out.println("3. Creating intern candidate");
            System.out.println("4. Searching selected candidate");
            System.out.println("5. Deleting selected candidate");
            System.out.println("6. Displaying all candidates");
            System.out.println("0. Exit!");

            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    candidateManager.createCandidate("Experience");
                    this.getOption();
                    break;
                case 2:
                    candidateManager.createCandidate("Fresher");
                    this.getOption();
                    break;

                case 3:
                    candidateManager.createCandidate("Intern");
                    this.getOption();
                    break;

                case 4:
                    System.out.println("Enter id: ");
                    int id1 = Integer.parseInt(sc.nextLine());

                    System.out.println("Enter type of candidate: ");
                    String candidateType1 = sc.nextLine();

                    Candidate selectedCandidate = candidateManager.searchCandidate(id1,candidateType1);
                    System.out.println(selectedCandidate);
                    break;

                case 5:
                    System.out.println("Enter id: ");
                    int id2 = Integer.parseInt(sc.nextLine());

                    System.out.println("Enter type of candidate: ");
                    String candidateType2 = sc.nextLine();

                    Candidate removedCandidate = candidateManager.deleteCandidate(id2,candidateType2);
                    System.out.println(removedCandidate);
                    break;

                case 6:
                    candidateManager.displayAllCandidates();
                    break;

                case 0:
                    System.exit(0);

                default:
                    System.out.println("No choice!");
            }
        }
    }

    public void getOption() {
        System.out.println("Do you want to continue? Choose Y to continue the program or" +
                " choose N to return main screen and display all candidates who are created");

        String option = sc.nextLine();

        while (!option.equals("N") && !option.equals("Y")) {
            System.out.println("Please check your option! Enter again: ");
            option = sc.nextLine();
        }

        if (option.equals("N"))
            candidateManager.displayAllCandidates();
        else
            displaySystem();
    }
}
