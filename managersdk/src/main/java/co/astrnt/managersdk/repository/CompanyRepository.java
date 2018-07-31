package co.astrnt.managersdk.repository;

import java.util.HashMap;

import co.astrnt.managersdk.core.AstronautApi;
import co.astrnt.managersdk.dao.ListCompanyApiDao;
import io.reactivex.Observable;

/**
 * Created by deni rohimat on 31/07/18
 */
public class CompanyRepository extends BaseRepository {
    private final AstronautApi mAstronautApi;

    public CompanyRepository(AstronautApi astronautApi) {
        mAstronautApi = astronautApi;
    }

    public Observable<ListCompanyApiDao> getListCompany() {

        HashMap<String, String> map = new HashMap<>();
        map.put("api_key", managerSDK.getApiKey());

        return mAstronautApi.getApiService().listCompany(map);
    }

}
