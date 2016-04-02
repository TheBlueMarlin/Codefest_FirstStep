package com.example.hilla_000.firststep;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;

/*
    Main activity will handle the launch of the app, the loading screen,
     as well global variables (if any) required by the program.
 */

public class MainActivity extends AppCompatActivity {

    public static Context ctx;

    Timer loadingTimer;
    ProgressBar loadingBar;

    long duration = 3000;     //
    long interval = 100;       // sets time interval of loading bar in milli seconds


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ctx = this.getApplicationContext();

        loadingTimer = new Timer(duration, interval);
        loadingBar = (ProgressBar)findViewById(R.id.progressBar);

        loadingTimer.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    /*
        Timer class handles the progress bar on the loading screen
     */
    public class Timer extends CountDownTimer {
        public void startCountdownTimer() {

        }

        public Timer(long startTime, long interval){
            super(startTime, interval);
        }

        public void onFinish(){
            //TODO: End Activity execution move to next activity

            Intent intent = new Intent(ctx, MenuActivity.class);
            startActivity(intent);
        }

        public void onTick(long millisUntilFinished){
            int progress = (int)((duration - millisUntilFinished)/100);
            loadingBar.setProgress(progress);
        }
    }

    //TODO: code to display lightbulb image

    //TODO: endLoading() method to procede to Hub_Activity

}
