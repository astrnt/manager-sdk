package co.astrnt.managersdk.dao;

/**
 * Created by deni rohimat on 23/07/18
 */
public class DetailQuestionApiDao extends BaseApiDao {

    private QuestionApiDao question;

    public QuestionApiDao getQuestion() {
        return question;
    }

    public void setQuestion(QuestionApiDao question) {
        this.question = question;
    }
}
