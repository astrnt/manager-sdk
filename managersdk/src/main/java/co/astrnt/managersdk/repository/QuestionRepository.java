package co.astrnt.managersdk.repository;

import java.util.HashMap;

import co.astrnt.managersdk.core.AstronautApi;
import co.astrnt.managersdk.dao.BaseApiDao;
import co.astrnt.managersdk.dao.DetailQuestionApiDao;
import co.astrnt.managersdk.dao.ListQuestionApiDao;
import io.reactivex.Observable;

/**
 * Created by deni rohimat on 23/07/18
 */
public class QuestionRepository extends BaseRepository {
    private final AstronautApi mAstronautApi;

    public QuestionRepository(AstronautApi astronautApi) {
        mAstronautApi = astronautApi;
    }

    public Observable<ListQuestionApiDao> getListQuestion(String jobId) {

        HashMap<String, String> map = new HashMap<>();
        map.put("api_key", managerSDK.getApiKey());
        map.put("job_identifier", jobId);

        return mAstronautApi.getApiService().listQuestion(map);
    }

    public Observable<DetailQuestionApiDao> getQuestion(String jobId, String questionId) {

        HashMap<String, String> map = new HashMap<>();
        map.put("api_key", managerSDK.getApiKey());
        map.put("job_identifier", jobId);
        map.put("question_identifier", questionId);

        return mAstronautApi.getApiService().getQuestion(map);
    }

    public Observable<BaseApiDao> addQuestion(String jobId, String title, int takesCount) {

        HashMap<String, String> map = new HashMap<>();
        map.put("api_key", managerSDK.getApiKey());
        map.put("job_identifier", jobId);
        map.put("title", title);
        map.put("takesCount", String.valueOf(takesCount));

        return mAstronautApi.getApiService().addQuestion(map);
    }

    public Observable<BaseApiDao> editQuestion(String jobId, String questionId, String title, int takesCount) {

        HashMap<String, String> map = new HashMap<>();
        map.put("api_key", managerSDK.getApiKey());
        map.put("job_identifier", jobId);
        map.put("question_identifier", questionId);
        map.put("title", title);
        map.put("takesCount", String.valueOf(takesCount));

        return mAstronautApi.getApiService().editQuestion(map);
    }

    public Observable<BaseApiDao> deleteQuestion(String jobId, String questionId) {

        HashMap<String, String> map = new HashMap<>();
        map.put("api_key", managerSDK.getApiKey());
        map.put("job_identifier", jobId);
        map.put("question_identifier", questionId);

        return mAstronautApi.getApiService().deleteQuestion(map);
    }

}
