package mubstimor.android.daggerpractice;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import mubstimor.android.daggerpractice.di.DaggerAppComponent;

public class BaseApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }
}
