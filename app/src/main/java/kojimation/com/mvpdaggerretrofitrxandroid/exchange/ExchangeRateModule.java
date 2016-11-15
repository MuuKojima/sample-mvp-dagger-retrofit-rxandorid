package kojimation.com.mvpdaggerretrofitrxandroid.exchange;

import dagger.Module;
import dagger.Provides;

/**
 * Created by muukojima on 2016/11/15.
 */

@Module
public class ExchangeRateModule {
    private final ExchangeRateView mView;

    public ExchangeRateModule(ExchangeRateView mView) {
        this.mView = mView;
    }

    @Provides
    ExchangeRateView provideExchangeRateView() {
        return mView;
    }
}
