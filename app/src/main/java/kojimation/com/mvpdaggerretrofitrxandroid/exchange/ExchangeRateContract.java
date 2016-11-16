package kojimation.com.mvpdaggerretrofitrxandroid.exchange;

import kojimation.com.mvpdaggerretrofitrxandroid.data.ExchangeRateResponse;

/**
 * Created by muukojima on 2016/11/16.
 */

public interface ExchangeRateContract {
    interface View {
        void bindExchangeRate(ExchangeRateResponse exchangeRateResponse);
    }

    interface Presenter {
        void getExchangeRate();
    }
}
