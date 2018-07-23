package co.astrnt.managersdk.repository;

import java.util.HashMap;

import co.astrnt.managersdk.core.AstronautApi;
import co.astrnt.managersdk.dao.AddJobApiDao;
import co.astrnt.managersdk.dao.BaseApiDao;
import co.astrnt.managersdk.dao.ListIndustryApiDao;
import co.astrnt.managersdk.dao.ListJobApiDao;
import io.reactivex.Observable;

/**
 * Created by deni rohimat on 23/07/18
 */
public class JobRepository extends BaseRepository {
    private final AstronautApi mAstronautApi;

    public JobRepository(AstronautApi astronautApi) {
        mAstronautApi = astronautApi;
    }

    public Observable<AddJobApiDao> createJob(
            String title, String job_type, String jobStatus, String requireCv,
            String aboutDescription, String responsibility, String requirement,
            String locations, String industry, String tags, String deadline,
            String logo_url, String company_name) {

        HashMap<String, String> map = new HashMap<>();
        map.put("api_key", managerSDK.getApiKey());
        map.put("title", title);
        map.put("job_type", job_type);
        map.put("jobStatus", jobStatus);
        map.put("requireCv", requireCv);
        map.put("aboutDescription", aboutDescription);
        map.put("responsibility", responsibility);
        map.put("requirement", requirement);
        map.put("locations", locations);
        map.put("industry", industry);
        map.put("tags", tags);
        map.put("deadline", deadline);
        map.put("logo_url", logo_url);
        map.put("company_name", company_name);

        return mAstronautApi.getApiService().createJob(map);
    }

    public Observable<BaseApiDao> editJob(String jobId, String title) {

        HashMap<String, String> map = new HashMap<>();
        map.put("api_key", managerSDK.getApiKey());
        map.put("job_identifier", jobId);
        map.put("title", title);

        return mAstronautApi.getApiService().editJob(map);
    }

    public Observable<BaseApiDao> deleteJob(String jobId) {

        HashMap<String, String> map = new HashMap<>();
        map.put("api_key", managerSDK.getApiKey());
        map.put("job_identifier", jobId);

        return mAstronautApi.getApiService().deleteJob(map);
    }

    public Observable<ListJobApiDao> getListJob() {

        HashMap<String, String> map = new HashMap<>();
        map.put("api_key", managerSDK.getApiKey());

        return mAstronautApi.getApiService().listJob(map);
    }

    public Observable<ListIndustryApiDao> getListIndustry() {
        return mAstronautApi.getApiService().listIndustry();
    }
}
