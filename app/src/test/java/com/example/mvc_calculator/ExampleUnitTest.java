package com.example.mvc_calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import static java.lang.Double.NaN;

import com.example.mvc_calculator.Models.CalculatorModel;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
private  CalculatorModel calculatorModel;
    @Before
    public void setup(){
        calculatorModel = new CalculatorModel();
    }

    @After
    public void teardown(){
        calculatorModel = null;
    }

    @Test
    public void twoPlusTwoEquals4() {
        double delta = 0.1;
        calculatorModel.setOperand1(2);
        calculatorModel.setOperand2(2);
        calculatorModel.add();

        assertEquals(4, calculatorModel.getResult(), delta);
    }

    @Test
    public void fivePlusTwoEquals7() {
        double delta = 0.1;
        calculatorModel.setOperand1(5);
        calculatorModel.setOperand2(2);
        calculatorModel.add();

        assertEquals(7, calculatorModel.getResult(), delta);
    }

    @Test
    public void minusFivePlusTwoEqualsMinus3() {
        double delta = 0.1;
        calculatorModel.setOperand1(-5);
        calculatorModel.setOperand2(2);
        calculatorModel.add();

        assertEquals(-3, calculatorModel.getResult(), delta);

    }

    @Test
    public void fiveMinusTwoEquals3(){
        double delta = 0.1;
        calculatorModel.setOperand1(5);
        calculatorModel.setOperand2(2);
        calculatorModel.subtract();

        assertEquals(3, calculatorModel.getResult(), delta);
    }

    @Test
    public void fiveMulFiveEquals25(){
        double delta = 0.1;
        calculatorModel.setOperand1(5);
        calculatorModel.setOperand2(5);
        calculatorModel.multiply();

        assertEquals(25, calculatorModel.getResult(), delta);

    }
    @Test
    public void minusfiveMulFiveEquals25(){
        double delta = 0.1;
        calculatorModel.setOperand1(-5);
        calculatorModel.setOperand2(5);
        calculatorModel.multiply();

        assertEquals(-25, calculatorModel.getResult(), delta);

    }

    @Test
    public void fiveDivFiveEquals1(){
        double delta = 0.1;
        calculatorModel.setOperand1(5);
        calculatorModel.setOperand2(5);
        calculatorModel.divide();

        assertEquals(1, calculatorModel.getResult(), delta);

    }

    @Test
    public void fiveDivZeroEqualsException(){
        double delta = 0.1;
        calculatorModel.setOperand1(5);
        calculatorModel.setOperand2(0);
        calculatorModel.divide();

        assertEquals(NaN, calculatorModel.getResult(), delta);

    }
}