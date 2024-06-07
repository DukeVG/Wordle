package com.example.wordlevg;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        // Load animations
        Animation translateText = AnimationUtils.loadAnimation(this, R.anim.translate_text);
        Animation translateButton = AnimationUtils.loadAnimation(this, R.anim.translate_button);

        // Start animations
        textView.startAnimation(translateText);
        button.startAnimation(translateButton);

        // Set OnClickListener for the button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start MainActivity
                Intent intent = new Intent(SplashActivity.this, TutorialActivity.class);
                startActivity(intent);
                // Finish SplashActivity
                finish();
            }
        });
    }
}
