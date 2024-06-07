package com.example.wordlevg;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class FeedbackActivity extends AppCompatActivity {

    private EditText commentEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        // Initialize views
        RatingBar ratingBar = findViewById(R.id.ratingBar);
        commentEditText = findViewById(R.id.commentEditText);
        Button likeButton = findViewById(R.id.likeButton);
        Button submitButton = findViewById(R.id.submitButton);

        // Set click listeners
        likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(FeedbackActivity.this, "Thank you for liking the app!", Toast.LENGTH_SHORT).show();
            }
        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String comment = commentEditText.getText().toString().trim();
                float rating = ratingBar.getRating();


                String feedbackMessage = "Rating: " + rating + "\nComment: " + comment;
                Toast.makeText(FeedbackActivity.this, "Feedback submitted:\n" + feedbackMessage, Toast.LENGTH_LONG).show();
            }
        });
    }
}