package co.astrnt.managersdk.repository;

import java.util.HashMap;

import co.astrnt.managersdk.core.ManagerApi;
import co.astrnt.managersdk.dao.AddJobApiDao;
import co.astrnt.managersdk.dao.ApiKeyInfoApiDao;
import co.astrnt.managersdk.dao.BaseApiDao;
import co.astrnt.managersdk.dao.ListIndustryApiDao;
import co.astrnt.managersdk.dao.ListJobApiDao;
import co.astrnt.managersdk.dao.ListJobTypeApiDao;
import io.reactivex.Observable;

/**
 * Created by deni rohimat on 23/07/18
 */
public class JobRepository extends BaseRepository {
    private final ManagerApi mManagerApi;

    public JobRepository(ManagerApi managerApi) {
        mManagerApi = managerApi;
    }

    public Observable<ApiKeyInfoApiDao> getCompanyInfo() {

        HashMap<String, String> map = new HashMap<>();
        map.put("api_key", managerSDK.getApiKey());

        return mManagerApi.getApiService().companyInfo(map);
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

        return mManagerApi.getApiService().createJob(map);
    }

    public Observable<BaseApiDao> editJob(String jobId, String title) {

        HashMap<String, String> map = new HashMap<>();
        map.put("api_key", managerSDK.getApiKey());
        map.put("job_identifier", jobId);
        map.put("title", title);

        return mManagerApi.getApiService().editJob(map);
    }

    public Observable<BaseApiDao> deleteJob(String jobId) {

        HashMap<String, String> map = new HashMap<>();
        map.put("api_key", managerSDK.getApiKey());
        map.put("job_identifier", jobId);

        return mManagerApi.getApiService().deleteJob(map);
    }

    public Observable<ListJobApiDao> getListJob() {

        HashMap<String, String> map = new HashMap<>();
        map.put("api_key", managerSDK.getApiKey());

        return mManagerApi.getApiService().listJob(map);
    }

    public Observable<ListJobApiDao> getListJobByCompany(String companyId) {

        HashMap<String, String> map = new HashMap<>();
        map.put("api_key", managerSDK.getApiKey());
        map.put("company_identifier", companyId);

        return mManagerApi.getApiService().listJob(map);
    }

    public Observable<ListJobApiDao> getJobDetail(String jobId) {

        HashMap<String, String> map = new HashMap<>();
        map.put("api_key", managerSDK.getApiKey());
        map.put("job_identifier", jobId);

        return mManagerApi.getApiService().listJob(map);
    }

    public Observable<ListJobTypeApiDao> getJobTypes() {
        return mManagerApi.getApiService().jobTypes();
    }

    public Observable<ListIndustryApiDao> getListIndustry() {
        return mManagerApi.getApiService().listIndustry();
    }
}
