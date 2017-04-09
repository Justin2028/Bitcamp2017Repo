package com.ateam.floppycopter;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class InitialsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.initials);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void goToDifficulty(View view) {
        EditText et = (EditText) findViewById(R.id.editText);
        String ini = et.getText().toString();
        if(ini.equals("")){
            Toast t = Toast.makeText(this, "Please enter your initials", Toast.LENGTH_SHORT);
            t.show();
        }
        else {
            startActivity(new Intent(this, DifficultySelect.class));
        }
    }
}
