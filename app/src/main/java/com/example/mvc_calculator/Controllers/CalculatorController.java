package com.example.mvc_calculator.Controllers;

import android.widget.Switch;

import android.widget.EditText;

import android.widget.TextView;

import com.example.mvc_calculator.Models.CalculatorModel;

public class CalculatorController {
    private CalculatorModel model;
    private TextView resultTextView;
    private Switch degSwt;
    private TextView inputTextView;

  
    public CalculatorController(CalculatorModel model, TextView resultTextView, TextView inputTextView) {
        this.model = model;
        this.resultTextView = resultTextView;
        this.inputTextView = inputTextView;
         //this.degSwt = degSwt;


    }

    public void onAddButtonClicked(){
        model.add();
        updateResultView();
    }

    public void onSubtractButtonClicked(){
        model.subtract();
        updateResultView();
    }
    public void onMultiplyButtonClicked(){
        model.multiply();
        updateResultView();
    }

    public void onDivisionButtonClicked(){
        model.divide();
        updateResultView();
    }


    public void onLogButtonClicked() {

        model.logarithm();
        updateResultView();
    }

    public void onPowerButtonClicked() {
        model.power();
        updateResultView();
    }

    public void onRootButtonClicked() {
        model.root();
        updateResultView();
    }


    public void onClearButtonClicked(){

        resultTextView.setText("");
        inputTextView.setText("");
    }

    public void onSineButtonClicked(){
        model.sine();
        updateResultView();
    }

    public void onCosineButtonClicked(){
        model.cosine();
        updateResultView();
    }

    public void onTangentButtonClicked(){
        model.tangent();
        updateResultView();
    }
    public void onButton1Clicked(){
        model.Button1();
        String updateView = model.getInput();
        updateInputView(updateView);
    }
    public void onButton2Clicked(){
        model.Button2();
        String updateView = model.getInput();
        updateInputView(updateView);
    }
    public void onButton3Clicked(){
        model.Button3();
        String updateView = model.getInput();
        updateInputView(updateView);
    }
    public void onButton4Clicked(){
        model.Button4();
        String updateView = model.getInput();
        updateInputView(updateView);
    }
    public void onButton5Clicked(){
        model.Button5();
        String updateView = model.getInput();
        updateInputView(updateView);
    }
    public void onButton6Clicked(){
        model.Button6();
        String updateView = model.getInput();
        updateInputView(updateView);
    }
    public void onButton7Clicked(){
        model.Button7();
        String updateView = model.getInput();
        updateInputView(updateView);
    }
    public void onButton8Clicked(){
        model.Button8();
        String updateView = model.getInput();
        updateInputView(updateView);
    }
    public void onButton9Clicked(){
        model.Button9();
        String updateView = model.getInput();
        updateInputView(updateView);
    }
    public void onButton0Clicked(){
        model.Button0();
        String updateView = model.getInput();
        updateInputView(updateView);
    }
    private void updateResultView(){
        double result = model.getResult();
        resultTextView.setText(String.valueOf(result));
    }
    public void updateInputView(String updateView){
        inputTextView.setText(inputTextView.getText()+ updateView );
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
