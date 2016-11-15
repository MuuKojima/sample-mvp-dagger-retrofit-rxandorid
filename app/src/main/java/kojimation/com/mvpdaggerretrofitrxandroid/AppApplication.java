package kojimation.com.mvpdaggerretrofitrxandroid;

import android.app.Application;

import kojimation.com.mvpdaggerretrofitrxandroid.data.ApiModule;
import kojimation.com.mvpdaggerretrofitrxandroid.data.AppComponent;
import kojimation.com.mvpdaggerretrofitrxandroid.data.AppModule;
import kojimation.com.mvpdaggerretrofitrxandroid.data.DaggerAppComponent;

/**
 * Created by muukojima on 2016/11/15.
 */

public class AppApplication extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .apiModule(new ApiModule())
                .build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}