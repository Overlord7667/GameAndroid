package com.betelgeuse.corp.gameandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }
    public void backMenu(View view){
        Intent intent = new Intent(this, MainActivity.class);
        //startActivity(intent);
        finish();
    }

    public void music(View view){
        Snackbar.make(view, getString(R.string.message3), Snackbar.LENGTH_LONG).show();
    }
    public void video(View view){
        Snackbar.make(view, getString(R.string.message4), Snackbar.LENGTH_LONG).show();
    }
    public void coll(View view){
        Snackbar.make(view, getString(R.string.message5), Snackbar.LENGTH_LONG).show();
    }
}