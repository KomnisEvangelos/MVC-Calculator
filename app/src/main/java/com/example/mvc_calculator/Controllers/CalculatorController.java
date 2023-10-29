package com.example.mvc_calculator.Controllers;

import android.widget.EditText;
import android.widget.TextView;

import com.example.mvc_calculator.Models.CalculatorModel;

public class CalculatorController {
    private CalculatorModel model;
    private TextView resultTextView;
    private EditText operand1EditText;
    private EditText operand2EditText;

    public CalculatorController(CalculatorModel model, TextView resultTextView,EditText operand1EditText,EditText operand2EditText) {
        this.model = model;
        this.resultTextView = resultTextView;
        this.operand1EditText = operand1EditText;
        this.operand2EditText = operand2EditText;

    }

    public void onAddButtonClicked(double operand1,double operand2){
        model.add(operand1,operand2);
        updateView();
    }

    public void onSubtractButtonClicked(double operand1,double operand2){
        model.subtract(operand1,operand2);
        updateView();
    }
    public void onMultiplyButtonClicked(double operand1,double operand2){
        model.multiply(operand1,operand2);
        updateView();
    }

    public void onDivisionButtonClicked(double operand1,double operand2){
        model.divide(operand1,operand2);
        updateView();
    }
    public void onClearButtonClicked(){
       operand1EditText.setText("");
       operand2EditText.setText("");
       resultTextView.setText("0");
    }
    private void updateView(){
        double result = model.getResult();
        resultTextView.setText(String.valueOf(result));
    }
}
