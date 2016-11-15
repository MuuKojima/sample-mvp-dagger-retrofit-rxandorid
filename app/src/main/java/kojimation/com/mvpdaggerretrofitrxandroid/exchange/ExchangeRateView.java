package kojimation.com.mvpdaggerretrofitrxandroid.exchange;

import kojimation.com.mvpdaggerretrofitrxandroid.data.ExchangeRateResponse;

/**
 * Created by muukojima on 2016/11/15.
 */

public interface ExchangeRateView {
    void bindExchangeRate(ExchangeRateResponse exchangeRateResponse);
}
