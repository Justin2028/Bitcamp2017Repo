package com.ateam.floppycopter;

import android.animation.IntArrayEvaluator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class DifficultySelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty_select);
    }

    public void goToGame(View view) {
        RadioGroup rg = (RadioGroup)findViewById(R.id.radioDiff);
        int difSelected = rg.getCheckedRadioButtonId();
        if(difSelected == R.id.radioEasy)
        {
            Data.DIFF.difficulty = Data.DIFF.EASY;
        }
        else if (difSelected == R.id.radioMedium){
            Data.DIFF.difficulty = Data.DIFF.MEDIUM;
        }
        else {
            Data.DIFF.difficulty = Data.DIFF.HARD;
            //hard
        }
        startActivity(new Intent(this, GameActivity.class));
    }
}
