package co.astrnt.managersdk.dao;

import java.util.List;

/**
 * Created by deni rohimat on 23/07/18
 */
public class ListJobApiDao extends BaseApiDao {

    private List<JobApiDao> job_list;

    public List<JobApiDao> getJob_name() {
        return job_list;
    }

    public void setJob_name(List<JobApiDao> job_list) {
        this.job_list = job_list;
    }
}
