package com.example.hilla_000.firststep;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class SplashActivity extends SettingsMenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}
