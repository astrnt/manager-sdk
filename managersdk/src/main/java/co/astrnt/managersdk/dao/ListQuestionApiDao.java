package co.astrnt.managersdk.dao;

import java.util.List;

/**
 * Created by deni rohimat on 23/07/18
 */
public class ListQuestionApiDao extends BaseApiDao {

    private List<QuestionApiDao> questions;

    public List<QuestionApiDao> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionApiDao> questions) {
        this.questions = questions;
    }
}
