package com.betelgeuse.corp.gameandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.GnssAntennaInfo;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newGame(View view){
        Snackbar.make(view, getString(R.string.message1), Snackbar.LENGTH_LONG).show();
    }
    public void info(View view){
        Snackbar.make(view, getString(R.string.message2), Snackbar.LENGTH_LONG).show();
    }
    public void settings(View view){
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
}