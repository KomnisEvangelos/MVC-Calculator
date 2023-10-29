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

    public void logarithm(double operand1, double operand2) {
        this.result = (Math.log(operand1) / Math.log(operand2));
    }

    public void power(double operand1, double operand2) {
        this.result = Math.pow(operand1,operand2);
    }

    public void root(double operand1) {

        this.result = Math.sqrt(operand1);
    }

    public double getResult() {
        return result;
    }
}
