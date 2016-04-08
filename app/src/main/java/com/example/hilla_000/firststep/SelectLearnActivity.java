package com.example.hilla_000.firststep;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SelectLearnActivity extends SettingsMenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_level_selection);
        setActivityLayout();
    }
    public void setActivityLayout(){
        ImageButton button_choice = (ImageButton) findViewById(R.id.imageButton);
        if (button_choice != null) {
            button_choice.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), LessonsActivity.class);
                            startActivity(intent);
                        }
                    }
            );
        }
    }
}
