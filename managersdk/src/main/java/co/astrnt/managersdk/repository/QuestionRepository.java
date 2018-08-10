package co.astrnt.managersdk.repository;

import java.util.HashMap;

import co.astrnt.managersdk.core.ManagerApi;
import co.astrnt.managersdk.dao.AddQuestionApiDao;
import co.astrnt.managersdk.dao.BaseApiDao;
import co.astrnt.managersdk.dao.DetailQuestionApiDao;
import co.astrnt.managersdk.dao.ListQuestionApiDao;
import io.reactivex.Observable;

/**
 * Created by deni rohimat on 23/07/18
 */
public class QuestionRepository extends BaseRepository {
    private final ManagerApi mManagerApi;

    public QuestionRepository(ManagerApi managerApi) {
        mManagerApi = managerApi;
    }

    public Observable<ListQuestionApiDao> getListQuestion(String jobId) {

        HashMap<String, String> map = new HashMap<>();
        map.put("api_key", managerSDK.getApiKey());
        map.put("job_identifier", jobId);

        return mManagerApi.getApiService().listQuestion(map);
    }

    public Observable<DetailQuestionApiDao> getQuestion(String jobId, String questionId) {

        HashMap<String, String> map = new HashMap<>();
        map.put("api_key", managerSDK.getApiKey());
        map.put("job_identifier", jobId);
        map.put("question_identifier", questionId);

        return mManagerApi.getApiService().getQuestion(map);
    }

    public Observable<AddQuestionApiDao> addQuestion(String jobId, String title, int takesCount) {

        HashMap<String, String> map = new HashMap<>();
        map.put("api_key", managerSDK.getApiKey());
        map.put("job_identifier", jobId);
        map.put("title", title);
        map.put("takesCount", String.valueOf(takesCount));

        return mManagerApi.getApiService().addQuestion(map);
    }

    public Observable<BaseApiDao> editQuestion(String jobId, String questionId, String title, int takesCount) {

        HashMap<String, String> map = new HashMap<>();
        map.put("api_key", managerSDK.getApiKey());
        map.put("job_identifier", jobId);
        map.put("question_identifier", questionId);
        map.put("title", title);
        map.put("takesCount", String.valueOf(takesCount));

        return mManagerApi.getApiService().editQuestion(map);
    }

    public Observable<BaseApiDao> deleteQuestion(String jobId, String questionId) {

        HashMap<String, String> map = new HashMap<>();
        map.put("api_key", managerSDK.getApiKey());
        map.put("job_identifier", jobId);
        map.put("question_identifier", questionId);

        return mManagerApi.getApiService().deleteQuestion(map);
    }

}
