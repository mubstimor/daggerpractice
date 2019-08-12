package mubstimor.android.daggerpractice.di.main;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import mubstimor.android.daggerpractice.ui.main.posts.PostsFragment;
import mubstimor.android.daggerpractice.ui.main.profile.ProfileFragment;

@Module
public abstract class MainFragmentBuildersModule {

    @ContributesAndroidInjector
    abstract ProfileFragment contributeProfileFragment();

    @ContributesAndroidInjector
    abstract PostsFragment contributePostsFragment();
}
