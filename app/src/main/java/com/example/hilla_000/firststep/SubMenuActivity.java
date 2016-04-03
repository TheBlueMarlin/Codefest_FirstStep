package com.example.hilla_000.firststep;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class SubMenuActivity extends AppCompatActivity {

    private boolean pause = false;

    private boolean continueMusic;

    private static MediaPlayer mainPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_menu);

        setMainMenuListener();
        setSettingsButtonListener();
        setProgressReportButtonListener();
        setBackButtonListener();
        setMuteButtonListener();

        mainPlayer = MediaPlayer.create(SubMenuActivity.this, R.raw.blop);
    }



    //<editor-fold desc="Button Listeners">
    //<editor-fold desc="MenuListener">
    public void setMainMenuListener(){
        ImageButton MainMenu = (ImageButton) findViewById(R.id.menuButton);
        if (MainMenu != null) {
            MainMenu.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            chooseSound();
                            mainPlayer.start();
                            Intent intent = new Intent(getApplicationContext(), MainMenuActivity.class);
                            startActivity(intent);
                        }
                    }
            );
        }
    }
    //</editor-fold>

    public void setSettingsButtonListener(){
        ImageButton settingsButton = (ImageButton) findViewById(R.id.settingsButton);
        if (settingsButton != null) {
            settingsButton.setOnClickListener(
                    new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            chooseSound();
                            mainPlayer.start();
                            Intent intent = new Intent(getApplicationContext(), SettingsMenuActivity.class);
                            startActivity(intent);
                        }
                    }
            );
        }
    }

    public void setProgressReportButtonListener(){
        ImageButton button_char = (ImageButton) findViewById(R.id.progressReportButton);
        if (button_char != null) {
            button_char.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            chooseSound();
                            mainPlayer.start();
                            Intent intent = new Intent(getApplicationContext(), ProgressReport.class);
                            startActivity(intent);
                        }
                    }
            );
        }
    }

    public void setBackButtonListener(){
        ImageButton button_char = (ImageButton) findViewById(R.id.backButton);
        if (button_char != null) {
            button_char.setOnClickListener(
                    new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            chooseSound();
                            mainPlayer.start();
                            //TODO: backstack execution here:
                            Intent intent = new Intent(getApplicationContext(), ChooseCharacter.class);
                            startActivity(intent);
                        }
                    }
            );
        }
    }

    public void setMuteButtonListener(){
        ImageButton button_char = (ImageButton) findViewById(R.id.backButton);
        if (button_char != null) {
            button_char.setOnClickListener(
                    new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            chooseSound();
                            mainPlayer.start();
                            if(pause = false) {
                                AppAudio.player.pause();
                                pause = true;
                            }
                            else{
                                AppAudio.player.start();
                                pause = true;
                            }
                        }
                    }
            );
        }
    }
    //</editor-fold>

    //<editor-fold desc="Music Control">
    //Code that handles the passing of audio control ques from one activity to the next
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
            mainPlayer = MediaPlayer.create(SubMenuActivity.this, R.raw.blop);
        }
        else if( number == 2)
        {
            mainPlayer = MediaPlayer.create(SubMenuActivity.this, R.raw.pop);
        }
        else if(number == 3)
        {
            mainPlayer = MediaPlayer.create(SubMenuActivity.this, R.raw.tick);
        }
        else if(number == 4)
        {
            mainPlayer = MediaPlayer.create(SubMenuActivity.this, R.raw.click);
        }
    }
    //</editor-fold>
}
