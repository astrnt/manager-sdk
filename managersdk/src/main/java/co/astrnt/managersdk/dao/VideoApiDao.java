package co.astrnt.managersdk.dao;

import java.util.List;

/**
 * Created by deni rohimat on 23/07/18
 */
public class VideoApiDao extends BaseApiDao {

    private List<String> videos;
    private List<String> thumbnails;
    private List<String> questions_identifier;

    public List<String> getVideos() {
        return videos;
    }

    public void setVideos(List<String> videos) {
        this.videos = videos;
    }

    public List<String> getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(List<String> thumbnails) {
        this.thumbnails = thumbnails;
    }

    public List<String> getQuestions_identifier() {
        return questions_identifier;
    }

    public void setQuestions_identifier(List<String> questions_identifier) {
        this.questions_identifier = questions_identifier;
    }
}
