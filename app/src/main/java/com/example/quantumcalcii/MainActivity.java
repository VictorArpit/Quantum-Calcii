package com.example.quantumcalcii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText etFirstValue, etSecondValue;
    TextView tvAns;
    Button add, sub, multiply, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondValue);
        tvAns = findViewById(R.id.tvAns);
        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnSubtract);
        multiply = findViewById(R.id.btnMultiply);
        div = findViewById(R.id.btnDivide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());
                ans = firstValue + secondValue;
                tvAns.setText("your Answer is = " + ans);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());
                ans = firstValue - secondValue;
                tvAns.setText("your Answer is = " + ans);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());
                ans = firstValue * secondValue;
                tvAns.setText("your Answer is = " + ans);


                  }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());
                ans = firstValue / secondValue;
                tvAns.setText("your Answer is = " + ans);
            }
        });
    }
}