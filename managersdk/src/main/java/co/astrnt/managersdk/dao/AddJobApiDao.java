package co.astrnt.managersdk.dao;

/**
 * Created by deni rohimat on 23/07/18
 */
public class AddJobApiDao extends BaseApiDao {

    private String job_identifier;

    public String getJob_identifier() {
        return job_identifier;
    }

    public void setJob_identifier(String job_identifier) {
        this.job_identifier = job_identifier;
    }
}
