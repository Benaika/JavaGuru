package com.ma.javaminds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.ma.javaminds.levels.Hard;

import com.ma.javaminds.R;

public class DifficultyScreen extends AppCompatActivity {

    Button btnEasy, btnModerate, btnHard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Make the activity full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_difficulty_screen);

        easy();
        moderate();
        hard();
    }

    private void elements(){
        btnEasy = findViewById(R.id.btnEasy);
        btnModerate = findViewById(R.id.btnModerate);
        btnHard = findViewById(R.id.btnHard);
    }
    private void easy(){
        elements();
        btnEasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DifficultyScreen.this, com.ma.javaminds.EasyLevel.class);
                startActivity(intent);
            }
        });
    }
    private void moderate(){
        elements();
        btnModerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DifficultyScreen.this, com.ma.javaminds.ModerateLevel.class);
                startActivity(intent);
            }
        });
    }
    private void hard(){
        elements();
        btnHard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DifficultyScreen.this, com.ma.javaminds.HardScreen.class);
                startActivity(intent);
            }
        });
    }
}