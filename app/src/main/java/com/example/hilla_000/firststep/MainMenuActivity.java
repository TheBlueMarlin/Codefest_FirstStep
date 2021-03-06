package com.example.hilla_000.firststep;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import java.util.Random;

public class MainMenuActivity extends SettingsMenuActivity {

    private static MediaPlayer mainPlayer;

    private boolean continueMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState){

        mainPlayer = MediaPlayer.create(MainMenuActivity.this, R.raw.blop);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        setLessonButtonListener();
        setPlayButtonListener();
        setCharacterButtonListener();
        setOptionsButtonListener();
    }


    //<editor-fold desc="Button Listeners">
    public void setLessonButtonListener(){
        ImageButton button_les = (ImageButton) findViewById(R.id.btn_goto_lesson);
        if (button_les != null) {
            button_les.setOnClickListener(
                    new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            chooseSound();
                            mainPlayer.start();
                            Intent intent = new Intent(getApplicationContext(), ChooseLearnCat.class);
                            startActivity(intent);
                        }
                    }
            );
        }
    }

    public void setPlayButtonListener(){
        ImageButton button_play = (ImageButton) findViewById(R.id.btn_goto_play);
        if (button_play != null) {
            button_play.setOnClickListener(
                    new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            chooseSound();
                            mainPlayer.start();
                            Intent intent = new Intent(getApplicationContext(), ChoosePlayCat.class);
                            startActivity(intent);
                        }
                    }
            );
        }
    }

    public void setCharacterButtonListener(){
        ImageButton button_char = (ImageButton) findViewById(R.id.btn_goto_char);
        if (button_char != null) {
            button_char.setOnClickListener(
                    new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            chooseSound();
                            mainPlayer.start();
                            Intent intent = new Intent(getApplicationContext(), ChooseCharacter.class);
                            startActivity(intent);
                        }
                    }
            );
        }
    }

    public void setOptionsButtonListener(){
        ImageButton menuButton = (ImageButton) findViewById(R.id.menuButton);
        if (menuButton != null) {
            menuButton.setOnClickListener(
                    new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            chooseSound();
                            mainPlayer.start();
                            Intent intent = new Intent(getApplicationContext(), SubMenuActivity.class);
                            startActivity(intent);
                        }
                    }
            );
        }
    }
    //</editor-fold>

    //<editor-fold desc="Music Control">
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
    //</editor-fold>

    //<editor-fold desc="Click Sound Selecter">
    //Selects the sound to be played by the icons when clicked
    public void chooseSound()
    {
        Random rand = new Random();
        int number = rand.nextInt(4) + 1;

        if(number == 1)
        {
            mainPlayer = MediaPlayer.create(MainMenuActivity.this, R.raw.blop);
        }
        else if( number == 2)
        {
            mainPlayer = MediaPlayer.create(MainMenuActivity.this, R.raw.pop);
        }
        else if(number == 3)
        {
            mainPlayer = MediaPlayer.create(MainMenuActivity.this, R.raw.tick);
        }
        else if(number == 4)
        {
            mainPlayer = MediaPlayer.create(MainMenuActivity.this, R.raw.click);
        }
    }
    //</editor-fold>
}

