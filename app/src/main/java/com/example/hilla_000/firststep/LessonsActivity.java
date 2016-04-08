package com.example.hilla_000.firststep;

import android.os.Bundle;

public class LessonsActivity extends SettingsMenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int idNum = getIntent().getIntExtra("id", 0);
        if(idNum == R.id.btn_goto_lesson)
        {
            setContentView(R.layout.learn_level_selection);
        }
        else{
            setContentView(R.layout.play_topic_selection);
        }

    }

}
