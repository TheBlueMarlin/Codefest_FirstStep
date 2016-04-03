package com.example.hilla_000.firststep;

import android.os.Bundle;

/**
 * Created by jonat on 4/8/2016.
 */
public class SelectPlayLevel extends SettingsMenuActivity {

    private boolean continueMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_play_level);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (!continueMusic) {
            AppWideAudio.pause();
        }
    }
    @Override
    protected void onResume() {
        super.onResume();
        continueMusic = false;
        AppWideAudio.start(this, R.raw.maintheme);
    }

}
