package com.yogeshkumar.semestercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GPA_SEM_2 extends AppCompatActivity {

    EditText et_sub1, et_sub2, et_sub3, et_sub4, et_sub5, et_sub6, et_sub7, et_sub8;
    Button btnCalGPA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa_sem2);

        et_sub1 = findViewById(R.id.et_sub_1);
        et_sub2 = findViewById(R.id.et_sub_2);
        et_sub3 = findViewById(R.id.et_sub_3);
        et_sub4 = findViewById(R.id.et_sub_4);
        et_sub5 = findViewById(R.id.et_sub_5);
        et_sub6 = findViewById(R.id.et_sub_6);
        et_sub7 = findViewById(R.id.et_sub_7);
        et_sub8 = findViewById(R.id.et_sub_8);
        btnCalGPA = findViewById(R.id.btnCalGPA);

        String name = getIntent().getStringExtra("name");

        btnCalGPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double sub1 = Double.parseDouble(et_sub1.getText().toString().trim());
                double sub2 = Double.parseDouble(et_sub2.getText().toString().trim());
                double sub3 = Double.parseDouble(et_sub3.getText().toString().trim());
                double sub4 = Double.parseDouble(et_sub4.getText().toString().trim());
                double sub5 = Double.parseDouble(et_sub5.getText().toString().trim());
                double sub6 = Double.parseDouble(et_sub6.getText().toString().trim());
                double sub7 = Double.parseDouble(et_sub7.getText().toString().trim());
                double sub8 = Double.parseDouble(et_sub8.getText().toString().trim());

                double cre1 = 4;
                double cre2 = 4;
                double cre3 = 3;
                double cre4 = 3;
                double cre5 = 4;
                double cre6 = 3;
                double cre7 = 2;
                double cre8 = 1;

                double Result = ((sub1*cre1)+(sub2*cre2)+(sub3*cre3)+(sub4*cre4)+(sub5*cre5)+(sub6*cre6)+(sub7*cre7)+(sub8*cre8))/
                        (cre1+cre2+cre3+cre4+cre5+cre6+cre7+cre8);

                Intent intent = new Intent(GPA_SEM_2.this, GPA_RESULT.class);
                intent.putExtra("result", Result);
                intent.putExtra("name", name);
                startActivity(intent);

            }
        });

    }
}