package Seminar_7_DZ_1.Base.AbstractClasses;

public abstract class ACNum {
    protected  double re;
    protected  String sign;
    protected double im;

    public void setRe(double re) {
        this.re = re;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public String getSign() {
        return sign;
    }

    public double getIm() {
        return im;
    }
}
