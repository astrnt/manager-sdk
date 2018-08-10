package co.astrnt.managersdk.repository;

import java.util.HashMap;

import co.astrnt.managersdk.core.ManagerApi;
import co.astrnt.managersdk.dao.ListCompanyApiDao;
import co.astrnt.managersdk.dao.ListNotificationApiDao;
import io.reactivex.Observable;

/**
 * Created by deni rohimat on 31/07/18
 */
public class CompanyRepository extends BaseRepository {
    private final ManagerApi mManagerApi;

    public CompanyRepository(ManagerApi managerApi) {
        mManagerApi = managerApi;
    }

    public Observable<ListCompanyApiDao> getListCompany() {

        HashMap<String, String> map = new HashMap<>();
        map.put("api_key", managerSDK.getApiKey());

        return mManagerApi.getApiService().listCompany(map);
    }

    public Observable<ListNotificationApiDao> getListNotification(String companyId, String lastNotificationId,
                                                                  int perPage) {

        HashMap<String, String> map = new HashMap<>();
        map.put("api_key", managerSDK.getApiKey());
        map.put("company_identifier", companyId);
        map.put("last_notification_id", lastNotificationId);
        map.put("notification_perpage", String.valueOf(perPage));

        return mManagerApi.getApiService().listNotification(map);
    }

}
