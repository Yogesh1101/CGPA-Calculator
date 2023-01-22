package com.yogeshkumar.semestercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class CGPA_Activity extends AppCompatActivity {

    TextView tvName;
    Spinner spinner;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa);

        tvName = findViewById(R.id.tvResultName);
        spinner = findViewById(R.id.spinner1);
        btnSubmit = findViewById(R.id.btnSubmit);

        String name = getIntent().getStringExtra("name");
        tvName.setText("Welcome, " + name);

        ArrayAdapter<CharSequence> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.Semesters));

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

                String item = spinner.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (spinner.getSelectedItem().equals("One")) {
                    Intent intent1 = new Intent(CGPA_Activity.this, CGPA_SEM_1.class);
                    intent1.putExtra("name", name);
                    startActivity(intent1);

                } else if (spinner.getSelectedItem().equals("Two")) {
                    Intent intent2 = new Intent(CGPA_Activity.this, CGPA_SEM_2.class);
                    intent2.putExtra("name", name);
                    startActivity(intent2);
                }
            }
        });


    }
}