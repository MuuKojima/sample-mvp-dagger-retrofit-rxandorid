package kojimation.com.mvpdaggerretrofitrxandroid.data;

/**
 * Created by muukojima on 2016/11/15.
 */

public class ExchangeRateResponse {
    private String base;
    private String date;
    private CountryCode rates;

    public String getBase() {
        return base;
    }

    public String getDate() {
        return date;
    }

    public CountryCode getRates() {
        return rates;
    }
}