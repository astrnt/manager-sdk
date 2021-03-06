package co.astrnt.samplemanagersdk;

import android.app.Application;

import co.astrnt.managersdk.ManagerSDK;
import co.astrnt.managersdk.core.ManagerApi;

public class AstronautApp extends Application {

    private static ManagerSDK astrntSDK;

    public static ManagerApi getApi() {
        return astrntSDK.getApi();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        setUpSDK();
    }

    private void setUpSDK() {
        if (astrntSDK == null) {
            astrntSDK = new ManagerSDK(this, BuildConfig.API_URL, BuildConfig.DEBUG);
        }
    }
}
