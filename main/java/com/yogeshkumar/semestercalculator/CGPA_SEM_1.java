package com.yogeshkumar.semestercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CGPA_SEM_1 extends AppCompatActivity {

    EditText etOne;
    Button btnCal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa_sem1);

        etOne = findViewById(R.id.etOne);
        btnCal = findViewById(R.id.btnCal);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = getIntent().getStringExtra("name");

                if (etOne.getText().toString().isEmpty())
                {
                    Toast.makeText(CGPA_SEM_1.this, "Please Enter All the Semesters GPA ! ", Toast.LENGTH_SHORT).show();
                }
                else
                {

                    double sem1 = Double.parseDouble(etOne.getText().toString().trim());

                    double cre1 = 26;

                    double Result = ((sem1*cre1))
                            /(cre1);

                    Intent intent = new Intent(CGPA_SEM_1.this, CGPA_RESULT.class);
                    intent.putExtra("result", Result);
                    intent.putExtra("name", name);
                    startActivity(intent);

                }

            }
        });

    }
}