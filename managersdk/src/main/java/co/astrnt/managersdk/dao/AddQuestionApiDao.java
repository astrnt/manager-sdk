package co.astrnt.managersdk.dao;

/**
 * Created by deni rohimat on 23/07/18
 */
public class AddQuestionApiDao extends BaseApiDao {

    private String question_identifier;

    public String getQuestion_identifier() {
        return question_identifier;
    }

    public void setQuestion_identifier(String question_identifier) {
        this.question_identifier = question_identifier;
    }
}
