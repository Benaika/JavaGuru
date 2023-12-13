package com.ma.javaminds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

import com.ma.javaminds.R;

public class PolicyUrl extends AppCompatActivity {
    private WebView policyUrlViewContent;
    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policy_url);

        preferences = getSharedPreferences("app_preferences", MODE_PRIVATE);

        policyUrlViewContent = findViewById(R.id.policyUrlViewContent);
        AppCompatButton agreeButton = findViewById(R.id.agreePolicyUrl);
        TextView cancelButton = findViewById(R.id.cancelPolicyUrl);

        WebSettings webSettings = policyUrlViewContent.getSettings();
        webSettings.setJavaScriptEnabled(true);

        policyUrlViewContent.setWebViewClient(new WebViewClient());

        String dataPolicyUrl = "https://sites.google.com/view/java-guru/home";
        policyUrlViewContent.loadUrl(dataPolicyUrl);

        agreeButton.setOnClickListener(v -> {
            // User agrees to the policy, save the preference and start DifficultyScreen
            SharedPreferences.Editor editor = preferences.edit();
            editor.putBoolean("policy_agreed", true);
            editor.apply();

            Intent intent = new Intent(PolicyUrl.this, com.ma.javaminds.DifficultyScreen.class);
            startActivity(intent);
            finish();
        });
        cancelButton.setOnClickListener(v -> {
            // User cancels, close the application
            finish();
        });
    }
}