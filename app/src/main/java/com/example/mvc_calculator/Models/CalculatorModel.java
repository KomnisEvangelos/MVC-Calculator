package com.example.mvc_calculator.Models;

public class CalculatorModel {
    private double result;
    private boolean isRad=false;

    public boolean isRad() {
        return isRad;
    }

    public void setRadStatus(boolean isRad) {
        this.isRad = isRad;
    }

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
            this.result = operand1 + operand2;
        }else{
            this.result = Double.NaN;
        }
    }

    public void sine(double operand1){

        if (isRad()){
            this.result = Math.sin(operand1);
        }else{
            double degrees = Math.toRadians(operand1);
            this.result = Math.sin(degrees);
        }
    }
    public void cosine(double operand1) {
        if (isRad()) {
            this.result = Math.cos(operand1);
        } else {
            double degrees = Math.toRadians(operand1);
            this.result = Math.cos(degrees);
        }
    }
    public void tangent(double operand1) {
        if (isRad()) {
            this.result = Math.tan(operand1);
        } else {
            double degrees = Math.toRadians(operand1);
            this.result = Math.tan(degrees);
        }
    }

    public double getResult() {
        return result;
    }
}
