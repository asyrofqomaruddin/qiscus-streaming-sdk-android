package com.qiscus.streaming.sample;

import android.app.Application;

import com.qiscus.sdk.Qiscus;
import com.qiscus.streaming.QiscusStreaming;

/**
 * Created by fitra on 27/09/17.
 */

public class SampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Qiscus.init(this, "sdksample");
        QiscusStreaming.init(this, "N2t5czYwU0VFMEgzdVZySW9WYWQ5alN6Q29KU2NnZndEeGppMThWZA==");
    }
}
