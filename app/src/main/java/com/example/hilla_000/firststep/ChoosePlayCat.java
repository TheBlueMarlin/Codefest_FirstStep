package com.example.hilla_000.firststep;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class ChoosePlayCat extends SettingsMenuActivity {

    private boolean continueMusic;

    private static MediaPlayer mainPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        mainPlayer = MediaPlayer.create(ChoosePlayCat.this, R.raw.blop);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_play_cat);
        setGame1ButtonListener();
        setGame2ButtonListener();
        setGame3ButtonListener();
        //openGame4();
    }
    public void setGame1ButtonListener(){
        ImageButton button_choice = (ImageButton) findViewById(R.id.imageButton_play);
        if (button_choice != null) {
            button_choice.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            chooseSound();
                            mainPlayer.start();
                            Intent intent = new Intent(getApplicationContext(), Game_Banana.class);
                            startActivity(intent);
                        }
                    }
            );
        }
    }

    public void setGame2ButtonListener(){
        ImageButton button_choice = (ImageButton) findViewById(R.id.imageButton2_play);
        if (button_choice != null) {
            button_choice.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            chooseSound();
                            mainPlayer.start();
                            Intent intent = new Intent(getApplicationContext(), Game_Matching.class);
                            startActivity(intent);
                        }
                    }
            );
        }
    }

    public void setGame3ButtonListener(){
        ImageButton button_choice = (ImageButton) findViewById(R.id.imageButton3_play);
        if (button_choice != null) {
            button_choice.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            chooseSound();
                            mainPlayer.start();
                             Intent intent = new Intent(getApplicationContext(), Game_Banana.class);
                             //Uncomment and change destination.
                            startActivity(intent);
                        }
                    }
            );
        }
    }

    public void openGame4(){
        ImageButton button_choice = (ImageButton) findViewById(R.id.imageButton4_play);
        if (button_choice != null) {
            button_choice.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            chooseSound();
                            mainPlayer.start();
                            Intent intent = new Intent(getApplicationContext(), Game_Matching.class);
                            //Uncomment and change destination.
                            startActivity(intent);
                        }
                    }
            );
        }
    }





    public void chooseSound()
    {
        Random rand = new Random();
        int number = rand.nextInt(4) + 1;

        if(number == 1)
        {
            mainPlayer = MediaPlayer.create(ChoosePlayCat.this, R.raw.blop);
        }
        else if( number == 2)
        {
            mainPlayer = MediaPlayer.create(ChoosePlayCat.this, R.raw.pop);
        }
        else if(number == 3)
        {
            mainPlayer = MediaPlayer.create(ChoosePlayCat.this, R.raw.tick);
        }
        else if(number == 4)
        {
            mainPlayer = MediaPlayer.create(ChoosePlayCat.this, R.raw.click);
        }
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
