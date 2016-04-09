package com.example.hilla_000.firststep;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ChoosePlayCat extends SettingsMenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

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
                             Intent intent = new Intent(getApplicationContext(), Game_Asteroid.class);
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
                            Intent intent = new Intent(getApplicationContext(), Game_Matching.class);
                            //Uncomment and change destination.
                            startActivity(intent);
                        }
                    }
            );
        }
    }
}
