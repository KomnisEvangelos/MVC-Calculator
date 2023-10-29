package com.example.mvc_calculator.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import com.example.mvc_calculator.Controllers.CalculatorController;
import com.example.mvc_calculator.Models.CalculatorModel;
import com.example.mvc_calculator.R;


public class MainActivity extends AppCompatActivity {

    private CalculatorModel model;
    private CalculatorController controller;
    private EditText operand1EditText;
    private EditText operand2EditText;
    private Switch degSwt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        model = new CalculatorModel();
        TextView resultTextView = findViewById(R.id.resultTextView);
        degSwt = findViewById(R.id.degSwt);
        controller = new CalculatorController(model,resultTextView,degSwt);

        operand1EditText = findViewById(R.id.operand1EditText);
        operand2EditText = findViewById(R.id.operand2EditText);


        Button addBtn = findViewById(R.id.addBtn);
        Button subtractBtn = findViewById(R.id.subtractBtn);
        Button sineBtn = findViewById(R.id.sineBtn);
        Button cosineBtn = findViewById(R.id.cosineBtn);
        Button tangentBtn = findViewById(R.id.tangentBtn);


        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double operand1 = Double.parseDouble(operand1EditText.getText().toString());
                double operand2 = Double.parseDouble(operand2EditText.getText().toString());

                controller.onAddButtonClicked(operand1,operand2);

            }
        });

        sineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double operand1 = Double.parseDouble(operand1EditText.getText().toString());

                controller.onSineButtonClicked(operand1);
            }
        });
        tangentBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                double operand1 = Double.parseDouble(operand1EditText.getText().toString());

                controller.onTangentButtonClicked(operand1);
            }
        });

        degSwt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked){
                    controller.onSwitchClicked(true);
                }else{
                    controller.onSwitchClicked(false);
                }
            }
        });
    }

    public void onSubtractButtonClicked(View v){
        double operand1 = Double.parseDouble(operand1EditText.getText().toString());
        double operand2 = Double.parseDouble(operand2EditText.getText().toString());

        controller.onSubtractButtonClicked(operand1,operand2);

    }

    public void onCosineButtonClicked(View v){
        double operand1 = Double.parseDouble(operand1EditText.getText().toString());

        controller.onCosineButtonClicked(operand1);
    }
}