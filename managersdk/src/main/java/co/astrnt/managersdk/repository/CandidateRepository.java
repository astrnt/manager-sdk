package co.astrnt.managersdk.repository;

import java.util.HashMap;

import co.astrnt.managersdk.core.AstronautApi;
import co.astrnt.managersdk.dao.ListCandidateApiDao;
import co.astrnt.managersdk.dao.ResponseVideoApiDao;
import io.reactivex.Observable;

/**
 * Created by deni rohimat on 23/07/18
 */
public class CandidateRepository extends BaseRepository {
    private final AstronautApi mAstronautApi;
    private final QuestionRepository mQuestionRepository;

    public CandidateRepository(AstronautApi astronautApi) {
        mAstronautApi = astronautApi;
        mQuestionRepository = new QuestionRepository(mAstronautApi);
    }

    public Observable<ListCandidateApiDao> getListCandidate(String jobId) {

        HashMap<String, String> map = new HashMap<>();
        map.put("api_key", managerSDK.getApiKey());
        map.put("job_identifier", jobId);

        return mAstronautApi.getApiService().listCandidate(map);
    }

    public Observable<ResponseVideoApiDao> getListVideos(String jobId, String candidateId) {

        HashMap<String, String> map = new HashMap<>();
        map.put("api_key", managerSDK.getApiKey());
        map.put("job_identifier", jobId);
        map.put("candidate_identifier", candidateId);

        return mAstronautApi.getApiService().listVideos(map);
    }

}
