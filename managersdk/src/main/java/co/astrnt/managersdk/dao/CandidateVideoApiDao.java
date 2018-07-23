package co.astrnt.managersdk.dao;

/**
 * Created by deni rohimat on 23/07/18
 */
public class CandidateVideoApiDao extends BaseApiDao {

    private String video;
    private String thumbnail;
    private String questions_identifier;
    private QuestionApiDao question;

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getQuestions_identifier() {
        return questions_identifier;
    }

    public void setQuestions_identifier(String questions_identifier) {
        this.questions_identifier = questions_identifier;
    }

    public QuestionApiDao getQuestion() {
        return question;
    }

    public void setQuestion(QuestionApiDao question) {
        this.question = question;
    }
}
