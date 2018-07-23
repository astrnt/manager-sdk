package co.astrnt.managersdk.dao;

import java.util.List;

/**
 * Created by deni rohimat on 23/07/18
 */
public class ListIndustryApiDao extends BaseApiDao {

    private List<IndustryApiDao> data;

    public List<IndustryApiDao> getData() {
        return data;
    }

    public void setData(List<IndustryApiDao> data) {
        this.data = data;
    }
}
