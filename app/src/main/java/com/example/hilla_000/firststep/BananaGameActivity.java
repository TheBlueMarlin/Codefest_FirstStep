package com.example.hilla_000.firststep;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class BananaGameActivity extends SettingsMenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.banana_game);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}
