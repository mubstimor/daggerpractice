package mubstimor.android.daggerpractice.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import mubstimor.android.daggerpractice.di.auth.AuthModule;
import mubstimor.android.daggerpractice.di.auth.AuthViewModelsModule;
import mubstimor.android.daggerpractice.ui.auth.AuthActivity;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class}
    )
    abstract AuthActivity contributeAuthActivity();

}
