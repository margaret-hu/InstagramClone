package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("YhJiBptQNy3YCBaqaP1hqcwzCOO15EjkKB7kRvit")
                .clientKey("mToTq72omi6iyYdOPCPcvKzwMtUJAChbuPjyXli4")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}