package com.example.intencjezadanie3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewString;
    private TextView textViewInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewString = findViewById(R.id.textViewString);
        textViewInt = findViewById(R.id.textViewInt);

        String receivedText = getIntent().getStringExtra("EXTRA_TEXT");
        int receivedInt = getIntent().getIntExtra("EXTRA_NUMBER", 0);

        textViewString.setText("Tekst: " + receivedText);
        textViewInt.setText("Liczba: " + receivedInt);
    }
}