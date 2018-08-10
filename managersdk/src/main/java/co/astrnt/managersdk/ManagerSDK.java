package co.astrnt.managersdk;

import android.content.Context;

import co.astrnt.managersdk.core.ManagerApi;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import timber.log.Timber;

public class ManagerSDK {

    private static final String DB_NAME = "astrntmanagerdb";
    private static final int DB_VERSION = 1;

    private static ManagerApi mManagerApi;
    private static String mApiUrl;
    private static String mApiKey;
    private Realm realm;
    private boolean isDebuggable;

    public ManagerSDK(Context context, String apiUrl, boolean debug, String apiKey) {
        mApiUrl = apiUrl;
        mApiKey = apiKey;
        isDebuggable = debug;

        if (debug) {
            Timber.plant(new Timber.DebugTree());
        }
        Realm.init(context);
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder()
                .name(DB_NAME)
                .schemaVersion(DB_VERSION)
                .deleteRealmIfMigrationNeeded()
                .build();

        realm = Realm.getInstance(realmConfiguration);
    }

    public ManagerSDK() {
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder()
                .name(DB_NAME)
                .schemaVersion(DB_VERSION)
                .deleteRealmIfMigrationNeeded()
                .build();

        this.realm = Realm.getInstance(realmConfiguration);
    }

    public Realm getRealm() {
        return realm;
    }

    public String getApiUrl() {
        return mApiUrl;
    }

    public String getApiKey() {
        return mApiKey;
    }

    public ManagerApi getApi() {
        if (mManagerApi == null) {
            mManagerApi = new ManagerApi(mApiUrl, isDebuggable);
        }
        return mManagerApi;
    }

}
