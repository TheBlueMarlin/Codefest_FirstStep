package com.example.hilla_000.firststep;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Activity learn level for Numbers category
 */
public class SelectLearnNumbersLevel extends SettingsMenuActivity {

    private boolean continueMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_learn_number_level);
        button();
        button2();
        //button3();
       // button4();
}

    // Setup event handler for level 1 select button
    public void button(){
        ImageButton button_choice = (ImageButton) findViewById(R.id.btn_numbers_level_1);
        if (button_choice != null) {
            button_choice.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), NumbersLesson1Activity.class);
                            startActivity(intent);
                        }
                    }
            );
        }
    }

    // Setup event handler for level 2 select button
    public void button2(){
        ImageButton button_choice2 = (ImageButton) findViewById(R.id.btn_numbers_level_2);
        if (button_choice2 != null) {
            button_choice2.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), NumbersLesson2Activity.class);
                            startActivity(intent);
                        }
                    }
            );
        }
    }
    /*

    // Setup event handler for button 3
    public void button3(){
        ImageButton button_choice3 = (ImageButton) findViewById(R.id.imageButton3);
        if (button_choice3 != null) {
            button_choice3.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), LettersLesson3Activity.class);
                            startActivity(intent);
                        }
                    }
            );
        }
    }

    // Setup event handlre for buton 4
    public void button4(){
        ImageButton button_choice4 = (ImageButton) findViewById(R.id.imageButton4);
        if (button_choice4 != null) {
            button_choice4.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), LettersLesson4Activity.class);
                            startActivity(intent);
                        }
                    }
            );
        }
    }*/

    /**
     * Handle onPause
     */
    @Override
    protected void onPause() {
        super.onPause();
        if (!continueMusic) {
            AppWideAudio.pause(); // pause music on activity pause
        }
    }
    @Override
    protected void onResume() {
        super.onResume();
        continueMusic = false;
        AppWideAudio.start(this, R.raw.maintheme); // restart music on resume activity
    }

}
