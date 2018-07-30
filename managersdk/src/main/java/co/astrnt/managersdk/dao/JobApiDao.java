package co.astrnt.managersdk.dao;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by deni rohimat on 23/07/18
 */
public class JobApiDao implements Parcelable {

    private String job_identifier;
    private String job_name;
    private String locations;
    private String description;
    private String responsibility;
    private String requirement;
    private String job_type;
    private String deadline;
    private int total_candidate;
    private String open_code;

    public String getJob_identifier() {
        return job_identifier;
    }

    public void setJob_identifier(String job_identifier) {
        this.job_identifier = job_identifier;
    }

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.job_identifier);
        dest.writeString(this.job_name);
        dest.writeString(this.locations);
        dest.writeString(this.description);
        dest.writeString(this.responsibility);
        dest.writeString(this.requirement);
        dest.writeString(this.job_type);
        dest.writeString(this.deadline);
        dest.writeInt(this.total_candidate);
        dest.writeString(this.open_code);
    }

    public JobApiDao() {
    }

    protected JobApiDao(Parcel in) {
        this.job_identifier = in.readString();
        this.job_name = in.readString();
        this.locations = in.readString();
        this.description = in.readString();
        this.responsibility = in.readString();
        this.requirement = in.readString();
        this.job_type = in.readString();
        this.deadline = in.readString();
        this.total_candidate = in.readInt();
        this.open_code = in.readString();
    }

    public static final Creator<JobApiDao> CREATOR = new Creator<JobApiDao>() {
        @Override
        public JobApiDao createFromParcel(Parcel source) {
            return new JobApiDao(source);
        }

        @Override
        public JobApiDao[] newArray(int size) {
            return new JobApiDao[size];
        }
    };
}
