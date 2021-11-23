package extra_assignement.controller;

import extra_assignement.models.Candidate;
import extra_assignement.models.Experience;
import extra_assignement.models.Fresher;
import extra_assignement.models.Intern;
import extra_assignement.services.CandidateManager;

import java.util.ArrayList;
import java.util.List;

public class CandidateTesting {
    public static void main(String[] args) {
        CandidateManager candidateManager = new CandidateManager();
        List<Candidate> candidateList = candidateManager.getCandidateList();

        Candidate candidate1 = new Experience(1,"Fernando","Torres",1997,"Spanish",
                "0123456789","torres@gmail.com","Experience",5,"senior");
        Candidate candidate2 = new Experience(2,"Cristiano","Ronaldo",1996,"Portugal",
                "0122334455","ronaldo@gmail.com","Experience",10,"master");
        Candidate candidate3 = new Experience(3,"Lionel","Messi",1995,"Argentina",
                "0123445566","messi@gmail.com","Experience",10,"master");
        Candidate candidate4 = new Experience(4,"Xabi","Alonso",1992,"Spanish",
                "0123456788","alonso@gmail.com","Experience",8,"senior");

        Candidate candidate5 = new Fresher(5,"erling","haaland",2002,"Norwegian",
                "0123456677","haaland@gmail.com","Fresher",2007,"Excellence","Dortmund");
        Candidate candidate6 = new Fresher(6,"marcus","rashford",2000,"England",
                "0122345678","rashford@gmail.com","Fresher",2005,"Good","Manchester United");
        Candidate candidate7 = new Fresher(7,"kevin","de bruyne",2000,"Belgium",
                "0211345678","bruyne@gmail.com","Fresher",2004,"Excellence","Manchester City");

        Candidate candidate8 = new Intern(8,"lautaro","martinez",2008,"Argentina",
                "0122345566","martinez@gmail.com","Intern","football","third-year","Inter Milan");
        Candidate candidate9 = new Intern(9,"phil","foden",2010,"England",
                "0233445588","foden@gmail.com","Intern","football","second-year","Manchester City");
        Candidate candidate10 = new Intern(10,"roberto","firmino",2007,"Brazil",
                "0344123456","firmino@gmail.com","Intern","football","first-year","Liverpool");

        candidateList.add(candidate1);
        candidateList.add(candidate2);
        candidateList.add(candidate3);
        candidateList.add(candidate4);
        candidateList.add(candidate5);
        candidateList.add(candidate6);
        candidateList.add(candidate7);
        candidateList.add(candidate8);
        candidateList.add(candidate9);
        candidateList.add(candidate10);

        CandidateManagementSystem candidateManagementSystem = new CandidateManagementSystem(candidateManager);
        candidateManagementSystem.displaySystem();
    }
}
