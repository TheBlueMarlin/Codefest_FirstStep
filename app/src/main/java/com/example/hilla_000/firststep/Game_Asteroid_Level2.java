package com.example.hilla_000.firststep;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by jonat on 4/9/2016.
 */
public class Game_Asteroid_Level2 extends SettingsMenuActivity{

    private static MediaPlayer mainPlayer;
    TextView result;
    private boolean continueMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState){


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_asteroid);
        result = (TextView) findViewById(R.id.textAnswer);
        mainPlayer = MediaPlayer.create(getApplicationContext(), R.raw.incorrect);

        setOp1ButtonListener();
        setOp2ButtonListener();
        setOp3ButtonListener();
    }


    public void setOp1ButtonListener(){
        ImageButton op1Button = (ImageButton) findViewById(R.id.num1);
        if (op1Button != null) {
            op1Button.setOnClickListener(
                    new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            chooseSound();
                            mainPlayer.start();
                            result.setText("Incorrect");
                            result.setTextSize(75);
                        }
                    }
            );
        }
    }

    public void setOp2ButtonListener(){
        ImageButton op2Button = (ImageButton) findViewById(R.id.num2);
        if (op2Button != null) {
            op2Button.setOnClickListener(
                    new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            result.setText("Correct");
                            result.setTextSize(75);
                        }
                    }
            );
        }
    }

    public void setOp3ButtonListener(){
        ImageButton op3Button = (ImageButton) findViewById(R.id.num3);
        if (op3Button != null) {
            op3Button.setOnClickListener(
                    new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            chooseSound();
                            mainPlayer.start();
                            result.setText("Incorrect");
                            result.setTextSize(75);
                        }
                    }
            );
        }
    }

    public void chooseSound()
    {
        mainPlayer = MediaPlayer.create(Game_Asteroid_Level2.this, R.raw.incorrect);
    }





}
