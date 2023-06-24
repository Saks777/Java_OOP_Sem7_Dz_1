package Seminar_7_DZ_1.Classes;

import Seminar_7_DZ_1.Base.AbstractClasses.AExpressionProcessor;
import Seminar_7_DZ_1.Classes.Complex.CNum;
import java.util.List;

public class ExpressionProcessor extends AExpressionProcessor {
    private boolean isComplex;

    public ExpressionProcessor(String expression) {
        super(expression);
        this.isComplex = false;
    }

    @Override
    public List<String> getSigns() {
        return this.signs;
    }

    @Override
    public List<Double> getValues() {
        return this.values;
    }

    @Override
    public List<CNum> getCNumValues() {
        return this.cNums;
    }

    public boolean isComplex() {
        return isComplex;
    }

    @Override
    public void expressionHandler() {

        String expr = this.expression.replaceAll("\\s", "");
        if (expr.contains("i")) {
            this.isComplex = true;
            String[] split = expr.split("\\)");

            for (int i = 0; i < split.length; i++) {// Переберем расспличенное выражение
                if (isMathSign(split[i].charAt(0))) { //Если начинается с мат знака
                    String[] secSplit = split[i].split("\\(");
                    this.signs.add(secSplit[0]);
                    this.cNums.add(createCnum(secSplit[1]));
                } else {
                    this.cNums.add(createCnum(split[i].substring(1, split[i].length())));
                }
            }
        } else {
            char[] cExpression = this.expression.toCharArray();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < cExpression.length; i++) {
                if(Character.isDigit(cExpression[i])){
                    sb.append(cExpression[i]);
                }else if(isMathSign(cExpression[i])){
                    this.values.add(Double.parseDouble(sb.toString()));
                    this.signs.add(Character.toString(cExpression[i]));
                    sb = new StringBuilder();
                }
            }
            this.values.add(Double.parseDouble(sb.toString()));
        }
    }

    private boolean isMathSign(char ch) {
        boolean isTrue = false;
        if (ch == '+') isTrue = true;
        else if (ch == '-') isTrue = true;
        else if (ch == '*') isTrue = true;
        else if (ch == '/') isTrue = true;
        return isTrue;
    }

    private CNum createCnum(String cNum) {
        String[] tmp;
        CNum num    = new CNum();
        double re   = 0;
        String sRe  = "";
        double im   = 0;
        String sIm  = "";
        String sign = "";
        if (cNum.contains("+")) {
            tmp = cNum.split("\\+");
            re = Double.parseDouble(tmp[0]);
            sign = "+";
            im = Double.parseDouble(tmp[1].substring(0, tmp[1].length() - 1));
        } else {
            tmp = cNum.split("-");
            sRe = (!tmp[0].equals(""))? tmp[0]:"-"+ tmp[1];
            re = Double.parseDouble(sRe);
            sign = "-";
            sIm = (!tmp[0].equals(""))? tmp[1].substring(0, tmp[1].length() - 1):tmp[2].substring(0, tmp[2].length() - 1);
            System.out.println(sIm);
            im = Double.parseDouble((sIm.equals(""))? "1":sIm);
        }
        num.setRe(re);
        num.setSign(sign);
        num.setIm(im);
        num.setsExpression(cNum);

        return num;
    }


}
