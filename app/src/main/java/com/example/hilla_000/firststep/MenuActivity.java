package com.example.hilla_000.firststep;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MenuActivity extends MasterActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void btn_goto_lesson_onClick(View view) {
        startActivity(new Intent(getApplicationContext(), LessonActivity.class));
    }

    public void btn_goto_tests_onClick(View view) {
        startActivity(new Intent(getApplicationContext(), TestsActivity.class));
    }

    public void btn_goto_games_onClick(View view) {
        startActivity(new Intent(getApplicationContext(), GamesActivity.class));
    }
}

