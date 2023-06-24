package Seminar_7_DZ_1.Classes.Binary;

import Seminar_7_DZ_1.Base.AbstractClasses.ABinaryOperation;

public class BinaryMultiplicationOperation extends ABinaryOperation {
    public BinaryMultiplicationOperation(double firstOperand, double secondOperand) {
        super(firstOperand, secondOperand);
    }

    @Override
    public double calculate() {
        return this.firstOperand * this.secondOperand;
    }
}