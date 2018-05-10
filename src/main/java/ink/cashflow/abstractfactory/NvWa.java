package ink.cashflow.abstractfactory;

import ink.cashflow.abstractfactory.abztract.Human;
import ink.cashflow.abstractfactory.factory.FemaleHumanFactory;
import ink.cashflow.abstractfactory.factory.HumanFactory;
import ink.cashflow.abstractfactory.factory.MaleHumanFactory;

public class NvWa {
    public static void main(String[] args) {

        HumanFactory maleHumanFactory = new MaleHumanFactory();

        HumanFactory femaleHumanFactory = new FemaleHumanFactory();

        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        maleYellowHuman.cry();
        maleYellowHuman.laugh();
        femaleYellowHuman.sex();
    }
}
