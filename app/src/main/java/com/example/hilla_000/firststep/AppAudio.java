package com.example.hilla_000.firststep;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class AppAudio extends Service {

    private MediaPlayer player = new MediaPlayer();

    public AppAudio() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        player = MediaPlayer.create(this, R.raw.maintheme); //TODO: Bind audio file here
        player.setLooping(true); //set looping
        player.setVolume(100, 100);
        player.start();
        player.setLooping(true);
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
