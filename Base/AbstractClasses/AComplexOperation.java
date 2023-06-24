package Seminar_7_DZ_1.Base.AbstractClasses;

import Seminar_7_DZ_1.Base.Interfaces.IComplexAction;
import Seminar_7_DZ_1.Classes.Complex.CNum;

public abstract class AComplexOperation implements IComplexAction {
    protected CNum firstCnum;

    public AComplexOperation(CNum firstCnum, CNum secondCnum) {
        this.firstCnum = firstCnum;
        this.secondCnum = secondCnum;
    }

    protected CNum secondCnum;
}