package com.example.newactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity implements ExampleDialog.ExampleDialogListener {

    CardView cardView;
    EditText edit_netflix, edit_hbo, edit_spotify;
    Button btn_subtract, btn_pay;
    TextView input_bal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        input_bal = findViewById(R.id.input_bal);
        Button btn_addbal = findViewById(R.id.btn_addbal);
        btn_subtract = findViewById(R.id.btn_subtract); // Remove the duplicate declaration here
        edit_netflix = findViewById(R.id.edit_netflix);
        edit_hbo = findViewById(R.id.edit_hbo);
        edit_spotify = findViewById(R.id.edit_spotify);


        btn_addbal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });

        btn_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtractValueFromTextView();
            }
        });
    }

    public void openDialog() {
        ExampleDialog exampleDialog = new ExampleDialog();
        exampleDialog.show(getSupportFragmentManager(), "BALANCE");
    }

    public void applyTexts(String balance) {
        input_bal.setText(balance);
    }

    private void subtractValueFromTextView() {
        String currentBalanceString = input_bal.getText().toString();
        int currentBalance = Integer.parseInt(currentBalanceString);

        edit_netflix = findViewById(R.id.edit_netflix); // Initialize edit_netflix EditText
        edit_hbo = findViewById(R.id.edit_hbo); // Initialize edit_hbo EditText
        edit_spotify = findViewById(R.id.edit_spotify); // Initialize edit_spotify EditText

        String netflixText = edit_netflix.getText().toString();
        String hboText = edit_hbo.getText().toString();
        String spotifyText = edit_spotify.getText().toString();

        int valueToSubtract = 0;

        if (!netflixText.isEmpty()) {
            valueToSubtract += Integer.parseInt(netflixText);
        }

        if (!hboText.isEmpty()) {
            valueToSubtract += Integer.parseInt(hboText);
        }

        if (!spotifyText.isEmpty()) {
            valueToSubtract += Integer.parseInt(spotifyText);
        }

        int newBalance = currentBalance - valueToSubtract;
        input_bal.setText(String.valueOf(newBalance));
    }
}