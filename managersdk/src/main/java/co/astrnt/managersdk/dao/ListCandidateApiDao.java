package co.astrnt.managersdk.dao;

import java.util.List;

/**
 * Created by deni rohimat on 23/07/18
 */
public class ListCandidateApiDao extends BaseApiDao {

    private List<CandidateApiDao> candidates;

    public List<CandidateApiDao> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<CandidateApiDao> candidates) {
        this.candidates = candidates;
    }
}
