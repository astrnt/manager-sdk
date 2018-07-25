package co.astrnt.managersdk.dao;

import java.util.List;

/**
 * Created by deni rohimat on 25/07/18
 */
public class ListJobTypeApiDao extends BaseApiDao {

    private List<JobTypeApiDao> data;

    public List<JobTypeApiDao> getData() {
        return data;
    }

    public void setData(List<JobTypeApiDao> data) {
        this.data = data;
    }
}
