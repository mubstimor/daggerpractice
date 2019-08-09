package mubstimor.android.daggerpractice.ui.auth;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import mubstimor.android.daggerpractice.models.User;
import mubstimor.android.daggerpractice.network.auth.AuthApi;

public class AuthViewModel extends ViewModel {
    private static final String TAG = "AuthViewModel";

    private final AuthApi authApi;

    @Inject
    public AuthViewModel(AuthApi authApi) {
        this.authApi = authApi;
        Log.d(TAG, "AuthViewModel: viewmodel is working ...");

       authApi.getUser(1)
               .toObservable()
               .subscribeOn(Schedulers.io())
               .subscribe(new Observer<User>() {
                   @Override
                   public void onSubscribe(Disposable d) {

                   }

                   @Override
                   public void onNext(User user) {
                       Log.d(TAG, "onNext: " + user.getEmail());

                   }

                   @Override
                   public void onError(Throwable e) {
                       Log.d(TAG, "onError: " + e);

                   }

                   @Override
                   public void onComplete() {

                   }
               });
    }
}
