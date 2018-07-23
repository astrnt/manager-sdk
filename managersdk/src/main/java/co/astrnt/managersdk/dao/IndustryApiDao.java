package co.astrnt.managersdk.dao;

/**
 * Created by deni rohimat on 23/07/18
 */
public class IndustryApiDao extends AddJobApiDao {

    private int id;
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
