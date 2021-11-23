package extra_assignement.services;

import extra_assignement.models.Candidate;

import java.util.List;

public interface CandidateService {
    public void createCandidate(String candidateType);
    public Candidate searchCandidate(int id, String candidateType);
    public Candidate deleteCandidate(int id, String candidateType);
    public void displayAllCandidates();
}
