package ink.cashflow.abstractfactory.human;

import ink.cashflow.abstractfactory.abztract.AbstractYellowHuman;

public class YellowMaleHuman extends AbstractYellowHuman{

    @Override
    public void sex() {
        System.out.println("黄人: 男性");
    }



}
