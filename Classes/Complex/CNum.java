package Seminar_7_DZ_1.Classes.Complex;

import Seminar_7_DZ_1.Base.AbstractClasses.ACNum;

public class CNum extends ACNum {
    private String sExpression;

    public void setsExpression(String sExpression) {
        this.sExpression = sExpression;
    }

    public String getsExpression() {
        return sExpression;
    }
}