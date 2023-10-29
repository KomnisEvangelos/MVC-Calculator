package com.example.mvc_calculator.Controllers;

import android.widget.Switch;

import android.widget.EditText;

import android.widget.TextView;

import com.example.mvc_calculator.Models.CalculatorModel;

public class CalculatorController {
    private CalculatorModel model;
    private TextView resultTextView;
    private Switch degSwt;
    private EditText operand1EditText;
    private EditText operand2EditText;
  
    public CalculatorController(CalculatorModel model, TextView resultTextView,EditText operand1EditText,
                                EditText operand2EditText,Switch degSwt) {
        this.model = model;
        this.resultTextView = resultTextView;
        this.operand1EditText = operand1EditText;
        this.operand2EditText = operand2EditText;
         this.degSwt = degSwt;


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


    public void onLogButtonClicked(double operand1, double operand2) {

        model.logarithm(operand1,operand2);
        updateView();
    }

    public void onPowerButtonClicked(double operand1, double operand2) {
        model.power(operand1,operand2);
        updateView();
    }

    public void onRootButtonClicked(double operand1) {
        model.root(operand1);
        updateView();
    }


    public void onClearButtonClicked(){
       operand1EditText.setText("");
       operand2EditText.setText("");
       resultTextView.setText("0");
    }

    public void onSineButtonClicked(double operand1){
        model.sine(operand1);
        updateView();
    }

    public void onCosineButtonClicked(double operand1){
        model.cosine(operand1);
        updateView();
    }

    public void onTangentButtonClicked(double operand1){
        model.tangent(operand1);
        updateView();
    }

    private void updateView(){
        double result = model.getResult();
        resultTextView.setText(String.valueOf(result));
    }

    public void onSwitchClicked(boolean isChecked){
        if (isChecked) {
            model.setRadStatus(false);
            degSwt.setText("degres");
        }else{
            model.setRadStatus(true);
            degSwt.setText("radius");
        }
    }
}
