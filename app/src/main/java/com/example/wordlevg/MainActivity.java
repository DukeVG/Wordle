package com.example.wordlevg;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    private final String WORD = "dubai";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edt11 = findViewById(R.id.edt11);
        EditText edt12 = findViewById(R.id.edt12);
        EditText edt13 = findViewById(R.id.edt13);
        EditText edt14 = findViewById(R.id.edt14);
        EditText edt15 = findViewById(R.id.edt15);
        EditText edt21 = findViewById(R.id.edt21);
        EditText edt22 = findViewById(R.id.edt22);
        EditText edt23 = findViewById(R.id.edt23);
        EditText edt24 = findViewById(R.id.edt24);
        EditText edt25 = findViewById(R.id.edt25);
        EditText edt31 = findViewById(R.id.edt31);
        EditText edt32 = findViewById(R.id.edt32);
        EditText edt33 = findViewById(R.id.edt33);
        EditText edt34 = findViewById(R.id.edt34);
        EditText edt35 = findViewById(R.id.edt35);
        EditText edt41 = findViewById(R.id.edt41);
        EditText edt42 = findViewById(R.id.edt42);
        EditText edt43 = findViewById(R.id.edt43);
        EditText edt44 = findViewById(R.id.edt44);
        EditText edt45 = findViewById(R.id.edt45);
        EditText edt51 = findViewById(R.id.edt51);
        EditText edt52 = findViewById(R.id.edt52);
        EditText edt53 = findViewById(R.id.edt53);
        EditText edt54 = findViewById(R.id.edt54);
        EditText edt55 = findViewById(R.id.edt55);
        EditText edt61 = findViewById(R.id.edt61);
        EditText edt62 = findViewById(R.id.edt62);
        EditText edt63 = findViewById(R.id.edt63);
        EditText edt64 = findViewById(R.id.edt64);
        EditText edt65 = findViewById(R.id.edt65);



        edt15.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() == 1) {
                    validateRow(edt11, edt12, edt13, edt14, edt15);
                }
            }
        });
        edt25.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() == 1) {
                    validateRow(edt21, edt22, edt23, edt24, edt25);
                }
            }
        });
        edt35.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() == 1) {
                    validateRow(edt31, edt32, edt33, edt34, edt35);
                }
            }
        });
        edt45.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() == 1) {
                    validateRow(edt41, edt42, edt43, edt44, edt45);
                }
            }
        });
        edt55.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() == 1) {
                    validateRow(edt51, edt52, edt53, edt54, edt55);
                }
            }
        });
        edt65.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() == 1) {
                    validateRow(edt61, edt62, edt63, edt64, edt65);
                }
            }
        });




    }

    private void validateRow(EditText edt1, EditText edt2, EditText edt3, EditText edt4, EditText edt5) {
        String edt1Txt = edt1.getText().toString();
        String edt3Txt = edt3.getText().toString();
        String edt4Txt = edt4.getText().toString();
        String edt5Txt = edt5.getText().toString();

        char[] wordChars = WORD.toCharArray();

        for (int i = 0; i < 5; i++) {
            EditText currentEditText = null;
            String currentEditTextText = null;
            switch (i) {
                case 0:
                    currentEditText = edt1;
                    currentEditTextText = edt1Txt;
                    break;
                case 1:
                    currentEditText = edt2;
                    currentEditTextText = edt2.getText().toString(); // Retrieve text directly
                    break;
                case 2:
                    currentEditText = edt3;
                    currentEditTextText = edt3Txt;
                    break;
                case 3:
                    currentEditText = edt4;
                    currentEditTextText = edt4Txt;
                    break;
                case 4:
                    currentEditText = edt5;
                    currentEditTextText = edt5Txt;
                    break;
            }

            if (currentEditTextText.equals(String.valueOf(wordChars[i]))) {
                currentEditText.setBackgroundColor(Color.parseColor("#33cc33")); // Correct character
            } else if (WORD.contains(currentEditTextText)) {
                currentEditText.setBackgroundColor(Color.parseColor("#ffff00")); // Incorrect position
            } else {
                currentEditText.setBackgroundColor(Color.parseColor("#ff3333")); // Incorrect character
            }
        }

        if (edt1Txt.equals(String.valueOf(wordChars[0])) &&
                edt2.getText().toString().equals(String.valueOf(wordChars[1])) &&
                edt3Txt.equals(String.valueOf(wordChars[2])) &&
                edt4Txt.equals(String.valueOf(wordChars[3])) &&
                edt5Txt.equals(String.valueOf(wordChars[4]))) {

            Toast.makeText(MainActivity.this, "Great! You made it!", Toast.LENGTH_SHORT).show();
            showBravoDialog();

        } else if (edt5.getId() == R.id.edt15) {
            Toast.makeText(MainActivity.this, "Bravo! You made it!", Toast.LENGTH_SHORT).show();

            showBravoDialog();

        }
    }

    private void showBravoDialog() {

        Toast.makeText(MainActivity.this, "Bravo! You made it!", Toast.LENGTH_SHORT).show();


        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Game Over");
        builder.setMessage("Wanna play again or provide feedback?");
        builder.setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.setNegativeButton("Feedback", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(MainActivity.this, FeedbackActivity.class);
                startActivity(intent);
            }
        });
        builder.show();
    }
}

