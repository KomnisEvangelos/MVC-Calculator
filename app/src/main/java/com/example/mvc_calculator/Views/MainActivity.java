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
import com.google.android.material.button.MaterialButton;


public class MainActivity extends AppCompatActivity {

    private CalculatorModel model;
    private CalculatorController controller;

    private MaterialButton button0 = null;
    private MaterialButton button1 = null;
    private MaterialButton button2 = null;
    private MaterialButton button3 = null;
    private MaterialButton button4 = null;
    private MaterialButton button5 = null;
    private MaterialButton button6 = null;
    private MaterialButton button7 = null;
    private MaterialButton button8 = null;
    private MaterialButton button9 = null;
    private MaterialButton buttonDot = null;
    private MaterialButton buttonAdd = null;
    private MaterialButton buttonSub = null;
    private MaterialButton buttonMultiply = null;
    private MaterialButton buttonDivide = null;
    private MaterialButton buttonPercent = null;
    private MaterialButton buttonClear = null;
    private MaterialButton buttonOFF = null;
    private MaterialButton buttonEqual = null;
    private MaterialButton addBtn = null;
    private MaterialButton subtractBtn = null; // dead code
    private MaterialButton sineBtn = null;
    private MaterialButton cosineBtn = null; // dead code
    private MaterialButton tangentBtn = null;
    private MaterialButton degSwt = null;
    private TextView inputTextView = null;
    private TextView resultTextView =null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.resultTextView);
        inputTextView = findViewById(R.id.inputTextView);
       
        model = new CalculatorModel();
        controller = new CalculatorController(model,resultTextView,inputTextView);



        addBtn = findViewById(R.id.addBtn);
        subtractBtn = findViewById(R.id.subtractBtn); // dead code
        sineBtn = findViewById(R.id.sineBtn);
        cosineBtn = findViewById(R.id.cosineBtn); // dead code
        tangentBtn = findViewById(R.id.tangentBtn);
        degSwt = findViewById(R.id.degSwt);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //double operand1 = Double.parseDouble(operand1EditText.getText().toString());
                //double operand2 = Double.parseDouble(operand2EditText.getText().toString());

                controller.onAddButtonClicked(operand1,operand2);

            }
        });

        sineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // double operand1 = Double.parseDouble(operand1EditText.getText().toString());

                controller.onSineButtonClicked(operand1);
            }
        });
        tangentBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
               // double operand1 = Double.parseDouble(operand1EditText.getText().toString());

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
        //double operand1 = Double.parseDouble(operand1EditText.getText().toString());
       // double operand2 = Double.parseDouble(operand2EditText.getText().toString());

        controller.onSubtractButtonClicked(operand1,operand2);

    }


    public void onCosineButtonClicked(View v){
       // double operand1 = Double.parseDouble(operand1EditText.getText().toString());

        controller.onCosineButtonClicked(operand1);
    }

    public void onMultiplyButtonClicked(View v){
       //double operand1 = Double.parseDouble(operand1EditText.getText().toString());
       // double operand2 = Double.parseDouble(operand2EditText.getText().toString());

        controller.onMultiplyButtonClicked(operand1,operand2);

    }
    public void onDivisionButtonClicked(View v){
       // double operand1 = Double.parseDouble(operand1EditText.getText().toString());
      //  double operand2 = Double.parseDouble(operand2EditText.getText().toString());

        controller.onDivisionButtonClicked(operand1,operand2);
    }


    public void onLogButtonClicked(View v) {
        //double operand1 = Double.parseDouble(operand1EditText.getText().toString());
       // double operand2 = Double.parseDouble(operand2EditText.getText().toString()); //Base

        controller.onLogButtonClicked(operand1,operand2);
    }

    public void onPowerButtonClicked (View v) {

       // double operand1 = Double.parseDouble(operand1EditText.getText().toString()); //Base
       // double operand2 = Double.parseDouble(operand2EditText.getText().toString());  //Exponent

        controller.onPowerButtonClicked(operand1,operand2);
    }

    public void onRootButtonClicked (View v) {
       // double operand1 = Double.parseDouble(operand1EditText.getText().toString());

        controller.onRootButtonClicked(operand1);
    }

    public void onClearButtonClicked(View v){
        controller.onClearButtonClicked();
    }

    public void onButton0Clicked(View v){
        controller.onButton0Clicked();
    }
    public void onButton1Clicked(View v){
        controller.onButton1Clicked();
    }
    public void onButton2Clicked(View v){
        controller.onButton2Clicked();
    }
    public void onButton3Clicked(View v){
        controller.onButton3Clicked();
    }
    public void onButton4Clicked(View v){
        controller.onButton4Clicked();
    }
    public void onButton5Clicked(View v){
        controller.onButton5Clicked();
    }
    public void onButton6Clicked(View v){
        controller.onButton6Clicked();
    }
    public void onButton7Clicked(View v){
        controller.onButton7Clicked();
    }
    public void onButton8Clicked(View v){
        controller.onButton8Clicked();
    }
    public void onButton9Clicked(View v){
        controller.onButton9Clicked();
    }

}