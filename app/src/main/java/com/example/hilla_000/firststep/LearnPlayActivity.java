package com.example.hilla_000.firststep;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LearnPlayActivity extends SettingsMenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        int idNum = getIntent().getIntExtra("id", 0);

        if(idNum == R.id.btn_goto_lesson)
        {
            setContentView(R.layout.learn_topic_selection);
        }
        else{
            setContentView(R.layout.play_topic_selection);
        }
        setActivityLayout();
    }
    public void setActivityLayout(){
        ImageButton button_choice = (ImageButton) findViewById(R.id.lesimageButton);
        if (button_choice != null) {
            button_choice.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), SelectionActivity.class);
                            intent.putExtra("id", v.getId());
                            startActivity(intent);
                        }
                    }
            );
        }
    }

}
