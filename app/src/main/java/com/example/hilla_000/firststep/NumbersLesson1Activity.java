package com.example.hilla_000.firststep;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

/**
 * Activity for Numbers category, Lesson 1
 */
public class NumbersLesson1Activity extends SettingsMenuActivity {

    int correctId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Set layout for activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_123lesson1);

        // Hard set the correct button
        correctId = R.id.btn_three;

        // Play the sound file for the question (the number three)
        MediaPlayer.create(getApplicationContext(), R.raw.number_three).start();
    }

    /**
     * Event handler for all the buttons on the layout
     * @param view View of the button that was pressed
     */
    public void sendMessage(View view) {

        // Get the id of the button being pressed
        int id = view.getId(); // Button id that was pressed

        // Check if the question button was press
        if(id == R.id.play_number_3)
        {
            // Replay the sound clip for the quesiton
            MediaPlayer.create(getApplicationContext(), R.raw.number_three).start();
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
