package com.example.hilla_000.firststep;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ChooseLearnCat extends SettingsMenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

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
                            Intent intent = new Intent(getApplicationContext(), SelectLearnLevel.class);
                            startActivity(intent);
                        }
                    }
            );
        }
    }
}
