package co.astrnt.managersdk;

import java.util.HashMap;

import co.astrnt.managersdk.dao.AddJobApiDao;
import co.astrnt.managersdk.dao.AddQuestionApiDao;
import co.astrnt.managersdk.dao.ApiKeyInfoApiDao;
import co.astrnt.managersdk.dao.BaseApiDao;
import co.astrnt.managersdk.dao.DetailQuestionApiDao;
import co.astrnt.managersdk.dao.ListCandidateApiDao;
import co.astrnt.managersdk.dao.ListCompanyApiDao;
import co.astrnt.managersdk.dao.ListIndustryApiDao;
import co.astrnt.managersdk.dao.ListJobApiDao;
import co.astrnt.managersdk.dao.ListJobTypeApiDao;
import co.astrnt.managersdk.dao.ListNotificationApiDao;
import co.astrnt.managersdk.dao.ListQuestionApiDao;
import co.astrnt.managersdk.dao.LoginApiDao;
import co.astrnt.managersdk.dao.ResponseVideoApiDao;
import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by deni rohimat on 23/07/18
 */
public interface ManagerApiService {

    //    COMPANY INFO
    @FormUrlEncoded
    @POST("job_list_integration_company_info")
    Observable<ApiKeyInfoApiDao> companyInfo(@FieldMap HashMap<String, String> data);

    //    JOB
    @FormUrlEncoded
    @POST("job_list_create_job")
    Observable<AddJobApiDao> createJob(@FieldMap HashMap<String, String> data);

    @FormUrlEncoded
    @POST("job_list_edit_job")
    Observable<BaseApiDao> editJob(@FieldMap HashMap<String, String> data);

    @FormUrlEncoded
    @POST("job_list_delete_job")
    Observable<BaseApiDao> deleteJob(@FieldMap HashMap<String, String> data);

    @FormUrlEncoded
    @POST("job_list_get_jobs_properties")
    Observable<ListJobApiDao> listJob(@FieldMap HashMap<String, String> data);

    @GET("astronaut_jobs_type")
    Observable<ListJobTypeApiDao> jobTypes();

    //    INDUSTRY
    @GET("job_list_industries")
    Observable<ListIndustryApiDao> listIndustry();

    //    CANDIDATE
    @FormUrlEncoded
    @POST("job_list_get_jobs_candidates")
    Observable<ListCandidateApiDao> listCandidate(@FieldMap HashMap<String, String> data);

    @FormUrlEncoded
    @POST("job_list_get_videos_with_attribute")
    Observable<ResponseVideoApiDao> listVideos(@FieldMap HashMap<String, String> data);

    @FormUrlEncoded
    @POST("job_list_get_questions_videos")
    Observable<ResponseVideoApiDao> listQuestionVideos(@FieldMap HashMap<String, String> data);

    //    QUESTION
    @FormUrlEncoded
    @POST("job_list_questions_list")
    Observable<ListQuestionApiDao> listQuestion(@FieldMap HashMap<String, String> data);

    @FormUrlEncoded
    @POST("job_list_get_question")
    Observable<DetailQuestionApiDao> getQuestion(@FieldMap HashMap<String, String> data);

    @FormUrlEncoded
    @POST("job_list_edit_question")
    Observable<BaseApiDao> editQuestion(@FieldMap HashMap<String, String> data);

    @FormUrlEncoded
    @POST("job_list_add_question")
    Observable<AddQuestionApiDao> addQuestion(@FieldMap HashMap<String, String> data);

    @FormUrlEncoded
    @POST("job_list_delete_question")
    Observable<BaseApiDao> deleteQuestion(@FieldMap HashMap<String, String> data);

    //    COMPANY
    @FormUrlEncoded
    @POST("astronaut/integration/login")
    Observable<LoginApiDao> getApiKey(@FieldMap HashMap<String, String> data);

    @FormUrlEncoded
    @POST("job_list_get_list_company")
    Observable<ListCompanyApiDao> listCompany(@FieldMap HashMap<String, String> data);

    @FormUrlEncoded
    @POST("job_list_get_notification")
    Observable<ListNotificationApiDao> listNotification(@FieldMap HashMap<String, String> data);

}