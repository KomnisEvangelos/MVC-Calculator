package com.example.mvc_calculator.Models;

public class CalculatorModel {
    private double result;

    public void add(double operand1, double operand2){
        this.result = operand1 + operand2;
    }

    public void subtract(double operand1, double operand2){
        this.result = operand1 - operand2;
    }

    public void multiply(double operand1, double operand2){
        this.result = operand1 * operand2;
    }
    public void divide(double operand1, double operand2) {

        if (operand2 != 0) {
            this.result = operand1 / operand2;
        }else{
            this.result = Double.NaN;
        }
    }


    public double getResult() {
        return result;
    }
}
