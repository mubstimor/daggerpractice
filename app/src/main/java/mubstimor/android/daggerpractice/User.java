package mubstimor.android.daggerpractice;

import javax.inject.Singleton;

public class User {

    private int id;
    private String username;

    public User(int id, String username) {
        this.id = id;
        this.username = username;
    }
}
