package kojimation.com.mvpdaggerretrofitrxandroid.exchange;

import android.util.Log;

import javax.inject.Inject;

import kojimation.com.mvpdaggerretrofitrxandroid.data.ExchangeRateApi;
import kojimation.com.mvpdaggerretrofitrxandroid.data.ExchangeRateResponse;
import retrofit2.Retrofit;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by muukojima on 2016/11/15.
 */

public class ExchangeRatePresenter {
    private Retrofit mRetrofit;
    private ExchangeRateView mView;

    @Inject
    public ExchangeRatePresenter(Retrofit retrofit, ExchangeRateView view) {
        this.mRetrofit = retrofit;
        this.mView = view;
    }

    public void getExchangeRate() {
        mRetrofit.create(ExchangeRateApi.class).getExchangeRate("USD", "JPY")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ExchangeRateResponse>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("通信 -> ", "失敗" + e.toString());
                    }

                    @Override
                    public void onNext(ExchangeRateResponse exchangeRateResponse) {
                        mView.bindExchangeRate(exchangeRateResponse);
                    }
                });
    }
}
