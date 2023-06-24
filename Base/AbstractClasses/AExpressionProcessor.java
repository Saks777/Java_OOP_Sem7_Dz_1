package Seminar_7_DZ_1.Base.AbstractClasses;

import Seminar_7_DZ_1.Base.Interfaces.ExpressionHandler;
import Seminar_7_DZ_1.Base.Interfaces.GetCNumValues;
import Seminar_7_DZ_1.Base.Interfaces.GetSigns;
import Seminar_7_DZ_1.Base.Interfaces.GetValues;
import Seminar_7_DZ_1.Classes.Complex.CNum;

import java.util.ArrayList;
import java.util.List;

public abstract class AExpressionProcessor implements GetValues, GetSigns, ExpressionHandler, GetCNumValues {
    protected List<Double> values;
    protected List<String> signs;
    protected List<CNum>   cNums;
    protected String expression;

    public AExpressionProcessor(String expression) {
        this.expression = expression;
        this.values = new ArrayList<>();
        this.signs = new ArrayList<>();
        this.cNums = new ArrayList<>();
    }
}