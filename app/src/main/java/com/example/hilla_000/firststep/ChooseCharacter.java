package com.example.hilla_000.firststep;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class ChooseCharacter extends SettingsMenuActivity {


    private static MediaPlayer mainPlayer;


    private boolean continueMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        mainPlayer = MediaPlayer.create(ChooseCharacter.this, R.raw.blop);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_character);

        setAirButtonListener();
        setRockButtonListener();
    }


    public void setAirButtonListener(){
        ImageButton button_avatar = (ImageButton) findViewById(R.id.airAvatarButton);
        final ImageView characterDisplay = (ImageView) findViewById(R.id.characterDisplay);
        final TextView name_avatar = (TextView) findViewById(R.id.displayText);
        if (button_avatar != null) {
            button_avatar.setOnClickListener(
                    new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            chooseSound();
                            mainPlayer.start();
                            characterDisplay.setImageResource(R.drawable.drop5);
                            name_avatar.setText("Poof McGroof");
                        }
                    }
            );
        }
    }

    public void setRockButtonListener(){
        ImageButton button_avatar2 = (ImageButton) findViewById(R.id.rockAvatarButton);
        final ImageView characterDisplay = (ImageView) findViewById(R.id.characterDisplay);
        final TextView name_avatar = (TextView) findViewById(R.id.displayText);
        if (button_avatar2 != null) {
            button_avatar2.setOnClickListener(
                    new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            chooseSound();
                            mainPlayer.start();
                            characterDisplay.setImageResource(R.drawable.drop4);
                            name_avatar.setText("'Lil Rocky");
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
            mainPlayer = MediaPlayer.create(ChooseCharacter.this, R.raw.blop);
        }
        else if( number == 2)
        {
            mainPlayer = MediaPlayer.create(ChooseCharacter.this, R.raw.pop);
        }
        else if(number == 3)
        {
            mainPlayer = MediaPlayer.create(ChooseCharacter.this, R.raw.tick);
        }
        else if(number == 4)
        {
            mainPlayer = MediaPlayer.create(ChooseCharacter.this, R.raw.click);
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
