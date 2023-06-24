package Seminar_7_DZ_1.Classes.Complex;

import Seminar_7_DZ_1.Base.AbstractClasses.AComplexOperation;

public class ComplexMultiplicationOperation extends AComplexOperation {
    public ComplexMultiplicationOperation(CNum firstCnum, CNum secondCnum) {
        super(firstCnum, secondCnum);
    }

    @Override
    public CNum calculate() {

        CNum num = new CNum();
        StringBuilder sb = new StringBuilder();

        double firstRe = this.firstCnum.getRe();
        double firstIm = (this.firstCnum.getSign().equals("+")? this.firstCnum.getIm():this.firstCnum.getIm()*-1);
        double secRe = this.secondCnum.getRe();
        double secondIm = (this.secondCnum.getSign().equals("+")? this.secondCnum.getIm():this.secondCnum.getIm()*-1);

        double re = (firstRe*secRe) + ((firstIm*secondIm)*-1);
        double im = (firstRe*secondIm)+(firstIm*secRe);
        String sign = (im>=0)? "+":"-";
        String expr = sb.append("(").append(re).append((im>0)?"+":"").append((im>0)?Double.toString(im) + "i)":")").toString();

        num.setRe(re);
        num.setSign(sign);
        num.setIm(im);
        num.setsExpression(expr);
        return num;
    }
}