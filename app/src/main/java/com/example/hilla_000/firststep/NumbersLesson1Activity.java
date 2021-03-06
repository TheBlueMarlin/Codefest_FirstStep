package com.example.hilla_000.firststep;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class NumbersLesson1Activity extends SettingsMenuActivity {

    int correctId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_123lesson1);

        correctId = R.id.btn_three;
        MediaPlayer.create(getApplicationContext(), R.raw.number_three).start();
    }

    public void sendMessage(View view) {
        int id = view.getId(); // Button id that was pressed

        if(id == R.id.play_number_3)
        {
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
