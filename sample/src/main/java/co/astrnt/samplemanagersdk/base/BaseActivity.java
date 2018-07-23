package co.astrnt.samplemanagersdk.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import co.astrnt.managersdk.ManagerSDK;
import co.astrnt.managersdk.core.AstronautApi;
import co.astrnt.samplemanagersdk.AstronautApp;

public class BaseActivity extends AppCompatActivity {
    protected Context context = this;
    protected ManagerSDK managerSDK;

    public static AstronautApi getApi() {
        return AstronautApp.getApi();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        managerSDK = new ManagerSDK();
    }
}
