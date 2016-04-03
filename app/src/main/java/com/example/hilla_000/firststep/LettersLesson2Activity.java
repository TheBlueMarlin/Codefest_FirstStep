package com.example.hilla_000.firststep;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

/**
 * Activity for Letters Category, Lesson 2
 */
public class LettersLesson2Activity extends SettingsMenuActivity {

    int correctId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abclesson2);
        correctId = R.id.btn_E; // hardcode the correct button to press
        MediaPlayer.create(getApplicationContext(), R.raw.letter_e).start(); // play question clip
    }

    /**
     * Event handler for all buttons
     * @param view View for the button that was pressed
     */
    public void sendMessage(View view) {
        int id = view.getId(); // Button id that was pressed

        // Replay the question clip
        if(id == R.id.play_letter_E)
        {
            MediaPlayer.create(getApplicationContext(), R.raw.letter_e).start();
        }
        else if(id == correctId)
        {
            // Play success sound
            MediaPlayer.create(getApplicationContext(), R.raw.correct).start();
        }
        else
        {
            // Play fail sound
            MediaPlayer.create(getApplicationContext(), R.raw.incorrect).start();
        }
    }
}
