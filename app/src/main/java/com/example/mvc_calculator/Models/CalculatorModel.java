package com.example.mvc_calculator.Models;

public class CalculatorModel {
    private double result = 0;
    private boolean isRad=false;
    private String input;

    private double operand1 = 0;
    private double operand2 = 0;

    public boolean isRad() {
        return isRad;
    }

    public void setRadStatus() {
        this.isRad = !isRad();

    }

    public void add(){
        this.result = operand1 + operand2;
    }

    public void subtract(){
        this.result = operand1 - operand2;
    }

    public void multiply(){
        this.result = operand1 * operand2;
    }
    public void factorial(){
        this.result= 1;
        for (int i = 1 ; i<= operand1;i++){
         this.result *=i;
        }
    }
    public void divide() {

        if (operand2 != 0) {
            this.result = operand1 / operand2;
        }else{
            this.result = Double.NaN;

        }
    }

    public void percent(){
        this.result = operand1 % operand2;
    }


    public void sine(){

        if (isRad()){
            this.result = Math.sin(operand1);
        }else{
            double degrees = Math.toRadians(operand1);
            this.result = Math.sin(degrees);
        }
    }
    public void cosine() {
        if (isRad()) {
            this.result = Math.cos(operand1);
        } else {
            double degrees = Math.toRadians(operand1);
            this.result = Math.cos(degrees);
        }
    }
    public void tangent() {
        if (isRad()) {
            this.result = Math.tan(operand1);
        } else {
            double degrees = Math.toRadians(operand1);
            this.result = Math.tan(degrees);
        }
    }



    public void logarithm() {
        this.result = (Math.log(operand1) / Math.log(operand2));
    }

    public void power() {
        this.result = Math.pow(operand1,operand2);
    }

    public void root() {

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

    public double getOperand1() {
        return operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public double getResult() {
        return result;
    }
}
