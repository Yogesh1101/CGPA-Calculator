package com.yogeshkumar.semestercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.yogeshkumar.semestercalculator.R;

import java.text.DecimalFormat;

public class GPA_RESULT extends AppCompatActivity {

    TextView tvResultName, tvResult;
    DecimalFormat format;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa_result);

        tvResultName = findViewById(R.id.tvResultName);
        tvResult = findViewById(R.id.tvResult);

        String name = getIntent().getStringExtra("name");
        tvResultName.setText(name);

        format = new DecimalFormat("#0.00");

        double Result = getIntent().getDoubleExtra("result", 0);
        tvResult.setText("Your GPA is : " + format.format(Result));

    }
}