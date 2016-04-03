package com.example.hilla_000.firststep;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import static java.lang.Thread.sleep;

public class LettersLesson1Activity extends SettingsMenuActivity {

    int correctId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abclesson1);
        correctId = R.id.btn_B;

    }

    public void sendMessage(View view) {
        int id = view.getId(); // Button id that was pressed

        if(id == R.id.play_letter_A)
        {
            MediaPlayer.create(getApplicationContext(), R.raw.correct).start();
        }
        else if(id == correctId)
        {
            // Play success sound
            MediaPlayer.create(getApplicationContext(), R.raw.letter_a).start();
        }
        else
        {
            // Play fail sound
            MediaPlayer.create(getApplicationContext(), R.raw.incorrect).start();
        }
    }
}
