package mubstimor.android.daggerpractice.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import mubstimor.android.daggerpractice.di.auth.AuthModule;
import mubstimor.android.daggerpractice.di.auth.AuthScope;
import mubstimor.android.daggerpractice.di.auth.AuthViewModelsModule;
import mubstimor.android.daggerpractice.di.main.MainFragmentBuildersModule;
import mubstimor.android.daggerpractice.di.main.MainModule;
import mubstimor.android.daggerpractice.di.main.MainScope;
import mubstimor.android.daggerpractice.di.main.MainViewModelsModule;
import mubstimor.android.daggerpractice.ui.auth.AuthActivity;
import mubstimor.android.daggerpractice.ui.main.MainActivity;

@Module
public abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class}
    )
    abstract AuthActivity contributeAuthActivity();

    @MainScope
    @ContributesAndroidInjector(
            modules = {MainFragmentBuildersModule.class, MainViewModelsModule.class, MainModule.class}
    )
    abstract MainActivity contributeMainActivity();

}
