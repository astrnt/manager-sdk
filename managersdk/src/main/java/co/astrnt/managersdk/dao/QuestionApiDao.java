package co.astrnt.managersdk.dao;

/**
 * Created by deni rohimat on 23/07/18
 */
public class QuestionApiDao {

    private String title;
    private int takesCount;
    private String prepTime;
    private String maxTime;
    private String question_identifier;
    private String job_identifier;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTakesCount() {
        return takesCount;
    }

    public void setTakesCount(int takesCount) {
        this.takesCount = takesCount;
    }

    public String getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(String prepTime) {
        this.prepTime = prepTime;
    }

    public String getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(String maxTime) {
        this.maxTime = maxTime;
    }

    public String getQuestion_identifier() {
        return question_identifier;
    }

    public void setQuestion_identifier(String question_identifier) {
        this.question_identifier = question_identifier;
    }

    public String getJob_identifier() {
        return job_identifier;
    }

    public void setJob_identifier(String job_identifier) {
        this.job_identifier = job_identifier;
    }
}
