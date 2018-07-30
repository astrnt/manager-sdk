package co.astrnt.managersdk.dao;

import java.util.List;

/**
 * Created by deni rohimat on 23/07/18
 */
public class ResponseVideoApiDao extends BaseApiDao {

    private List<VideoApiDao> videos;

    public List<VideoApiDao> getVideos() {
        return videos;
    }

    public void setVideos(List<VideoApiDao> videos) {
        this.videos = videos;
    }
}
