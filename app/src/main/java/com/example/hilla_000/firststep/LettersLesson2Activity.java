package com.example.hilla_000.firststep;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class LettersLesson2Activity extends SettingsMenuActivity {

    int correctId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abclesson2);
        correctId = R.id.btn_E;
        MediaPlayer.create(getApplicationContext(), R.raw.letter_e).start();
    }

    public void sendMessage(View view) {
        int id = view.getId(); // Button id that was pressed

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
