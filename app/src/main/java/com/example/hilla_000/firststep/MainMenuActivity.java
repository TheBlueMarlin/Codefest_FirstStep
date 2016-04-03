package com.example.hilla_000.firststep;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainMenuActivity extends SettingsMenuActivity {

    private static MediaPlayer mainPlayer;



    @Override
    protected void onCreate(Bundle savedInstanceState){


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        setLessonButtonListener();
        setPlayButtonListener();
        setCharacterButtonListener();
    }

    public void setLessonButtonListener(){
        ImageButton button_les = (ImageButton) findViewById(R.id.btn_goto_lesson);
        if (button_les != null) {
            button_les.setOnClickListener(
                    new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
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
                            Intent intent = new Intent(getApplicationContext(), ChooseCharacter.class);
                            startActivity(intent);
                        }
                    }
            );
        }
    }
}

