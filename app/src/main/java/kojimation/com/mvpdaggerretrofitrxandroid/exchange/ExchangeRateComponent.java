package kojimation.com.mvpdaggerretrofitrxandroid.exchange;

import dagger.Component;
import kojimation.com.mvpdaggerretrofitrxandroid.PerActivity;
import kojimation.com.mvpdaggerretrofitrxandroid.data.AppComponent;

/**
 * Created by muukojima on 2016/11/15.
 */

@PerActivity
@Component(dependencies = AppComponent.class, modules = ExchangeRateModule.class)
public interface ExchangeRateComponent {
    void inject(MainActivity activity);
}
