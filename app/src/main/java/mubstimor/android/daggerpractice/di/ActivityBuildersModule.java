package mubstimor.android.daggerpractice.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import mubstimor.android.daggerpractice.di.auth.AuthViewModelsModule;
import mubstimor.android.daggerpractice.ui.auth.AuthActivity;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class}
    )
    abstract AuthActivity contributeAuthActivity();

}
