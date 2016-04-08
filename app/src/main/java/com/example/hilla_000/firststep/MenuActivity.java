package com.example.hilla_000.firststep;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.ImageButton;

public class MenuActivity extends SettingsMenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setLessonButtonListener();
        setPlayButtonListener();
        setCharacterButtonListener();
    }

    public void setLessonButtonListener(){
        ImageButton button_lrn = (ImageButton) findViewById(R.id.btn_goto_lesson);
        if (button_lrn != null) {
            button_lrn.setOnClickListener(
                    new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            Intent intent = new Intent(MenuActivity.this, LessonsActivity.class);
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
                            Intent intent = new Intent(MenuActivity.this, LearnPlayActivity.class);
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
                            Intent intent = new Intent(MenuActivity.this, AvatarActivity.class);
                            startActivity(intent);
                        }
                    }
            );
        }
    }
}

