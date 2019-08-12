package mubstimor.android.daggerpractice.di.main;

import dagger.Module;
import dagger.Provides;
import mubstimor.android.daggerpractice.network.main.MainApi;
import mubstimor.android.daggerpractice.ui.main.posts.PostsRecyclerAdapter;
import retrofit2.Retrofit;

@Module
public class MainModule {

    @Provides
    static PostsRecyclerAdapter provideAdapter(){
        return new PostsRecyclerAdapter();
    }

    @Provides
    static MainApi provideMainApi(Retrofit retrofit){
        return retrofit.create(MainApi.class);
    }
}
