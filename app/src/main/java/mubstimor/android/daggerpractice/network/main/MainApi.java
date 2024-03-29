package mubstimor.android.daggerpractice.network.main;

import java.util.List;

import io.reactivex.Flowable;
import mubstimor.android.daggerpractice.models.Post;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MainApi {

    // posts?userId=1\
    @GET("posts")
    Flowable<List<Post>> getPostsFromUser(
            @Query("userId") int id
    );
}
