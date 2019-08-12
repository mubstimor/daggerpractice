package mubstimor.android.daggerpractice.di.main;

import dagger.Module;
import dagger.Provides;
import mubstimor.android.daggerpractice.di.auth.AuthScope;
import mubstimor.android.daggerpractice.network.main.MainApi;
import mubstimor.android.daggerpractice.ui.main.posts.PostsRecyclerAdapter;
import retrofit2.Retrofit;

@Module
public class MainModule {

    @MainScope
    @Provides
    static PostsRecyclerAdapter provideAdapter(){
        return new PostsRecyclerAdapter();
    }

    @MainScope
    @Provides
    static MainApi provideMainApi(Retrofit retrofit){
        return retrofit.create(MainApi.class);
    }
}
