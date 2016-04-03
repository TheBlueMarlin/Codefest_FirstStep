package com.example.hilla_000.firststep;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class ChooseLearnCat extends SettingsMenuActivity {

    private static MediaPlayer mainPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        mainPlayer = MediaPlayer.create(ChooseLearnCat.this, R.raw.blop);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_learn_cat);
        setActivityLayout();
    }

    public void setActivityLayout(){
       ImageButton button_choice = (ImageButton) findViewById(R.id.imageButton_les);
        if (button_choice != null) {
            button_choice.setOnClickListener(
                    new View.OnClickListener() {
                       @Override
                        public void onClick(View v) {
                           chooseSound();
                           mainPlayer.start();
                            Intent intent = new Intent(getApplicationContext(), SelectLearnLevel.class);
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
            mainPlayer = MediaPlayer.create(ChooseLearnCat.this, R.raw.blop);
        }
        else if( number == 2)
        {
            mainPlayer = MediaPlayer.create(ChooseLearnCat.this, R.raw.pop);
        }
        else if(number == 3)
        {
            mainPlayer = MediaPlayer.create(ChooseLearnCat.this, R.raw.tick);
        }
        else if(number == 4)
        {
            mainPlayer = MediaPlayer.create(ChooseLearnCat.this, R.raw.click);
        }
    }
}
