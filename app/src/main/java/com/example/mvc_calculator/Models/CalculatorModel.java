package com.example.mvc_calculator.Models;

public class CalculatorModel {
    private double result;
    private boolean isRad=false;
    private String input;

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
            this.result = operand1 / operand2;
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



    public void logarithm(double operand1, double operand2) {
        this.result = (Math.log(operand1) / Math.log(operand2));
    }

    public void power(double operand1, double operand2) {
        this.result = Math.pow(operand1,operand2);
    }

    public void root(double operand1) {

        this.result = Math.sqrt(operand1);
    }

    public void Button1(){
        input = "1";
    }
    public void Button2(){
        input = "2";
    }
    public void Button3(){
        input = "3";
    }
    public void Button4(){
        input = "4";
    }
    public void Button5(){
        input = "5";
    }
    public void Button6(){
        input = "6";
    }
    public void Button7(){
        input = "7";
    }
    public void Button8(){
        input = "8";
    }
    public void Button9(){
        input = "9";
    }
    public void Button0(){
        input = "0";
    }

    public String getInput() {
        return input;
    }

    public double getResult() {
        return result;
    }
}
