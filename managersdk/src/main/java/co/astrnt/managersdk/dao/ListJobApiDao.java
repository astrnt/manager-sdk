package co.astrnt.managersdk.dao;

import java.util.List;

/**
 * Created by deni rohimat on 23/07/18
 */
public class ListJobApiDao extends BaseApiDao {

    private List<JobApiDao> jobs_properties;

    public List<JobApiDao> getJobs() {
        return jobs_properties;
    }

    public void setJobs(List<JobApiDao> jobs_properties) {
        this.jobs_properties = jobs_properties;
    }
}
