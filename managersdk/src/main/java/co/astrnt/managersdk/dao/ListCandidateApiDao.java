package co.astrnt.managersdk.dao;

import java.util.List;

/**
 * Created by deni rohimat on 23/07/18
 */
public class ListCandidateApiDao extends BaseApiDao {

    private List<CandidatApiDao> candidates;

    public List<CandidatApiDao> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<CandidatApiDao> candidates) {
        this.candidates = candidates;
    }
}
