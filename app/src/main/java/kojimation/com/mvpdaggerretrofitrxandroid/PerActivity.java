package kojimation.com.mvpdaggerretrofitrxandroid;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by muukojima on 2016/11/15.
 */

@Documented
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {}

