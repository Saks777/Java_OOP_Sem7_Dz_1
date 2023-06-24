package Seminar_7_DZ_1.Base.AbstractClasses;

import Seminar_7_DZ_1.Base.Interfaces.IMathAction;

public abstract class ABinaryOperation implements IMathAction {
    protected double firstOperand;
    protected double secondOperand;

    public ABinaryOperation(double firstOperand, double secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }
}