package co.astrnt.managersdk.dao;

/**
 * Created by deni rohimat on 23/07/18
 */
public class CandidatApiDao {

    private String candidate_identifier;
    private String name;
    private String email;
    private String interview_code;

    public String getCandidate_identifier() {
        return candidate_identifier;
    }

    public void setCandidate_identifier(String candidate_identifier) {
        this.candidate_identifier = candidate_identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInterview_code() {
        return interview_code;
    }

    public void setInterview_code(String interview_code) {
        this.interview_code = interview_code;
    }
}
