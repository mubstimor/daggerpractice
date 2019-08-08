package mubstimor.android.daggerpractice.di;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import mubstimor.android.daggerpractice.AuthActivity;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();

}
