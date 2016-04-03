package com.example.hilla_000.firststep;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

public class AppAudio extends Service {

    private MediaPlayer player = new MediaPlayer();
    private static final String TAG = "AppAudio";

    public AppAudio() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        player = MediaPlayer.create(this, R.raw.maintheme); //TODO: Bind audio file here
        player.start();
        player.setVolume(100, 100);
        player.setLooping(true);

        Log.i(TAG, "Service audio on Create");
    }

    public void onDestroy(){
        player.start();
    }

    public void onPause(){
        player.pause();
    }

    public void onResume(){
        player.start();
    }

}
