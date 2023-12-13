package com.ma.javaminds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.VideoView;

import com.ma.javaminds.R;

public class SplashScreen extends AppCompatActivity {

    VideoView background;
    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Make the activity full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        preferences = getSharedPreferences("app_preferences", MODE_PRIVATE);

        // Always show the splash screen
        showSplashScreen();

    }
    private void showSplashScreen() {
        VideoView background = findViewById(R.id.background);

        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.splashscreen);
        background.setVideoURI(videoUri);

        background.setOnCompletionListener(mp -> background.start());

        background.start();

        // Check if the user has agreed to the policy
        new Handler().postDelayed(() -> {
            if (preferences.getBoolean("policy_agreed", false)) {
                startNextActivity(com.ma.javaminds.DifficultyScreen.class);
            } else {
                startNextActivity(com.ma.javaminds.PolicyUrl.class);
            }
        }, 3000);
    }

    private void startNextActivity(Class<?> activityClass) {
        Intent intent = new Intent(SplashScreen.this, activityClass);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
        finish();
    }
}