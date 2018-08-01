package co.astrnt.managersdk.dao;

/**
 * Created by deni rohimat on 01/08/18
 */
public class NotificationApiDao {

    private String type;
    private String candidateName;
    private String questionText;
    private String jobName;
    private String videoThumbnail;
    private int notification_id;
    private String timestamp;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getVideoThumbnail() {
        return videoThumbnail;
    }

    public void setVideoThumbnail(String videoThumbnail) {
        this.videoThumbnail = videoThumbnail;
    }

    public int getNotification_id() {
        return notification_id;
    }

    public void setNotification_id(int notification_id) {
        this.notification_id = notification_id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
