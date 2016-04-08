package com.example.hilla_000.firststep;

import android.os.Bundle;

public class SelectionActivity extends SettingsMenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int idNum = getIntent().getIntExtra("id", 0);
        if(idNum == R.id.lesimageButton)
        {
            setContentView(R.layout.learn_level_selection);
        }
        else{
            setContentView(R.layout.play_topic_selection);
        }

    }
}
