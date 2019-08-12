package mubstimor.android.daggerpractice.di.main;

import androidx.lifecycle.ViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import mubstimor.android.daggerpractice.di.ViewModelKey;
import mubstimor.android.daggerpractice.ui.main.posts.PostsViewModel;
import mubstimor.android.daggerpractice.ui.main.profile.ProfileViewModel;

@Module
public abstract class MainViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel.class)
    public abstract ViewModel bindProfileViewModel(ProfileViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PostsViewModel.class)
    public abstract ViewModel bindPostsViewModel(PostsViewModel viewModel);
}
