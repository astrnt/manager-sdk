package co.astrnt.managersdk.dao;

/**
 * Created by deni rohimat on 23/07/18
 */
public class JobApiDao extends AddJobApiDao {

    private String job_name;
    private String locations;
    private String description;
    private String responsibility;
    private String requirement;
    private String job_type;
    private String deadline;
    private int total_candidate;
    private String open_code;

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getJob_type() {
        return job_type;
    }

    public void setJob_type(String job_type) {
        this.job_type = job_type;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public int getTotal_candidate() {
        return total_candidate;
    }

    public void setTotal_candidate(int total_candidate) {
        this.total_candidate = total_candidate;
    }

    public String getOpen_code() {
        return open_code;
    }

    public void setOpen_code(String open_code) {
        this.open_code = open_code;
    }
}
