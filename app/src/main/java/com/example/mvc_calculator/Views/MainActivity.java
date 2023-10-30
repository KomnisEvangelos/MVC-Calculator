package com.example.mvc_calculator.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mvc_calculator.Controllers.CalculatorController;
import com.example.mvc_calculator.Models.CalculatorModel;
import com.example.mvc_calculator.R;
import com.google.android.material.button.MaterialButton;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


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
                controller.updateInputView(" + ");
            }
        });

        sineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                controller.updateInputView("sin ");

            }
        });
        tangentBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                controller.updateInputView("tan ");
            }
        });

//        degSwt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//
//                if (isChecked){
//                    controller.onSwitchClicked(true);
//                }else{
//                    controller.onSwitchClicked(false);
//                }
//            }
//        });
    }

    public void onSubtractButtonClicked(View v){

        controller.updateInputView(" - ");

    }


    public void onCosineButtonClicked(View v){
        controller.updateInputView("cos ");
    }

    public void onMultiplyButtonClicked(View v){

        controller.updateInputView(" * ");

    }
    public void onDivisionButtonClicked(View v){

        controller.updateInputView(" / ");
    }


    public void onLogButtonClicked(View v) {
        //double operand1 = Double.parseDouble(operand1EditText.getText().toString());
       // double operand2 = Double.parseDouble(operand2EditText.getText().toString()); //Base

       // controller.onLogButtonClicked(operand1,operand2);
    }

    public void onPowerButtonClicked (View v) {

        controller.updateInputView(" ^ ");
    }

    public void onRootButtonClicked (View v) {

        double operand1 = Double.parseDouble(inputTextView.getText().toString());
        model.setOperand1(operand1);
        controller.onRootButtonClicked();
    }

    public void onButtonEqualsClicked(View v){
        String charSequnce = inputTextView.getText().toString();
        String pattern = "([\\d.]+)\\s*([+\\-*/^%])\\s*([\\d.]+)";

        Pattern regex = Pattern.compile(pattern);

        Matcher matcher = regex.matcher(charSequnce);


        if(matcher.find()){
            try{
                String operand1 = matcher.group(1);
                String operator = matcher.group(2);
                String operand2 = matcher.group(3);

                model.setOperand1(Double.parseDouble(operand1));
                model.setOperand2(Double.parseDouble(operand2));

                switch (operator){
                    case "+":
                        controller.onAddButtonClicked();
                        break;
                    case "-":
                        controller.onSubtractButtonClicked();
                        break;
                    case "*":
                        controller.onMultiplyButtonClicked();
                        break;
                    case "/":
                        controller.onDivisionButtonClicked();
                        break;
                    case "%":
                        //mod
                        break;
                    case "^":
                        controller.onPowerButtonClicked();
                    default:
                        break;
                }

            }catch (Exception e){
                //Toast.makeText(getApplicationContext(),"catch",Toast.LENGTH_SHORT);
                e.printStackTrace();

            }
        }else{
            if(charSequnce.contains("sin")){
                //TODO sin
            }else if (charSequnce.contains("cos")){
                //TODO cos
            }else if (charSequnce.contains("tan")){
                //TODO tan
            }else if (charSequnce.contains("log")){
                //TODO log
            }
        }

        Log.d("Status","out");

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