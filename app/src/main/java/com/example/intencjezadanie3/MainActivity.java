package com.example.intencjezadanie3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextString;
    private EditText editTextInt;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextString = findViewById(R.id.editTextString);
        editTextInt = findViewById(R.id.editTextInt);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textValue = editTextString.getText().toString();

                int intValue;
                try {
                    intValue = Integer.parseInt(editTextInt.getText().toString());
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Wprowadź poprawną liczbę całkowitą", Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("EXTRA_TEXT", textValue);
                intent.putExtra("EXTRA_NUMBER", intValue);

                startActivity(intent);
            }
        });
    }
}