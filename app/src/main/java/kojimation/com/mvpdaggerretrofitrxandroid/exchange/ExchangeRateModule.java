package kojimation.com.mvpdaggerretrofitrxandroid.exchange;

import dagger.Module;
import dagger.Provides;

/**
 * Created by muukojima on 2016/11/15.
 */

@Module
public class ExchangeRateModule {
    private final ExchangeRateContract.View mView;

    public ExchangeRateModule(ExchangeRateContract.View view) {
        this.mView = view;
    }

    @Provides
    ExchangeRateContract.View provideExchangeRateView() {
        return mView;
    }
}
