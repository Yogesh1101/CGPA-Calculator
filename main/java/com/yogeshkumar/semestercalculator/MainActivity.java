package com.yogeshkumar.semestercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    Button btnGPA, btnCGPA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        btnGPA = findViewById(R.id.btnGPA);
        btnCGPA = findViewById(R.id.btnCGPA);

        btnGPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(etName.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter your name", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String Name = etName.getText().toString().trim();
                    Intent intent = new Intent(MainActivity.this, GPA_Activity.class);
                    intent.putExtra("name", Name);
                    startActivity(intent);
                }

            }
        });

        btnCGPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(etName.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter your name", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String Name = etName.getText().toString().trim();
                    Intent intent = new Intent(MainActivity.this, CGPA_Activity.class);
                    intent.putExtra("name", Name);
                    startActivity(intent);
                }

            }
        });

    }
}