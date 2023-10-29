package com.example.mvc_calculator.Controllers;

import android.widget.TextView;

import com.example.mvc_calculator.Models.CalculatorModel;

public class CalculatorController {
    private CalculatorModel model;
    private TextView resultTextView;

    public CalculatorController(CalculatorModel model, TextView resultTextView) {
        this.model = model;
        this.resultTextView = resultTextView;
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

    private void updateView(){
        double result = model.getResult();
        resultTextView.setText(String.valueOf(result));
    }
}
