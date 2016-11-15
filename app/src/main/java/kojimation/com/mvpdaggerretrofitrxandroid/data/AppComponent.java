package kojimation.com.mvpdaggerretrofitrxandroid.data;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by muukojima on 2016/11/15.
 */

@Singleton
@Component(modules = {AppModule.class, ApiModule.class})
public interface AppComponent {
    Retrofit retrofit();
}
