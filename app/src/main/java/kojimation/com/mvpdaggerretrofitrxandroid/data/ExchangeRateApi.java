package kojimation.com.mvpdaggerretrofitrxandroid.data;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by muukojima on 2016/11/15.
 */

public interface ExchangeRateApi {
    String URL = "/latest";

    @GET(URL)
    Observable<ExchangeRateResponse> getExchangeRate(@Query("base") String base,
                                                     @Query("symbols") String symbols);
}