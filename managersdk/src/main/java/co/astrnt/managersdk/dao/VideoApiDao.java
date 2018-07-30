package co.astrnt.managersdk.dao;

/**
 * Created by deni rohimat on 30/07/18
 */
public class VideoApiDao extends BaseApiDao {

    private String thumbnail_url;
    private String video_url;
    private String question_title;

    public String getThumbnail_url() {
        return thumbnail_url;
    }

    public void setThumbnail_url(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public String getQuestion_title() {
        return question_title;
    }

    public void setQuestion_title(String question_title) {
        this.question_title = question_title;
    }
}
