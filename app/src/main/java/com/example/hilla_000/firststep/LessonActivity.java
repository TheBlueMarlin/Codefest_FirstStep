package com.example.hilla_000.firststep;

import android.os.Bundle;

/**
 * Lessons Select Activity for all categories
 */
@Deprecated
public class LessonActivity extends SettingsMenuActivity {

    private boolean continueMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

    }

    /**
     * onPause called when activity pauses, pauses music
     */
    @Override
    protected void onPause() {
        super.onPause();
        if (!continueMusic) {
            AppWideAudio.pause();
        }
    }

    /**
     * onResume called when activity resumes, resumes music
     */
    @Override
    protected void onResume() {
        super.onResume();
        continueMusic = false;
        AppWideAudio.start(this, R.raw.maintheme);
    }

}
