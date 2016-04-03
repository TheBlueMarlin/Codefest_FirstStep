package com.example.hilla_000.firststep;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;

import java.util.Timer;

public class SplashActivity extends SettingsMenuActivity {

    private static MediaPlayer splashPlayer;
    public static Context ctx;

    private static final String TAG = "SplashActivity";

    Timer loadingTimer;
    ProgressBar loadingBar;

    long duration = 3000;
    long interval = 100;

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.i(TAG, "splash onDestroy");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        ctx = this.getApplicationContext();

        loadingTimer = new Timer(duration, interval);
        loadingBar = (ProgressBar)findViewById(R.id.progressBar);

        loadingTimer.start();
        splashPlayer = MediaPlayer.create(SplashActivity.this, R.raw.splashsound);
        splashPlayer.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //INflate the men; this adds items to the action bar if it is present/
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.action_settings){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public class Timer extends CountDownTimer{
        public void startCountdownTimer(){

        }

        public Timer(long startTime, long interval) {super(startTime, interval);}

        public void onFinish(){
            Intent intent = new Intent(ctx, AppAudio.class);
            startService(intent);
            intent = new Intent(ctx, MainMenuActivity.class);
            startActivity(intent);
        }

        public void onTick(long millisUntilFinished) {
            int progress = (int)((duration - millisUntilFinished)/100);
            loadingBar.setProgress(progress);
        }
    }

}
