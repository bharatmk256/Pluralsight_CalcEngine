package com.bharat.calcengine.calcengine;

public class Adder extends CalculateBase {
    public Adder (){}
    public Adder(double leftVal, double righVal){
        super(leftVal, righVal);

    }

    @Override
    public void calculate() {
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }
}
