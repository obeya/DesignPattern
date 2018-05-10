package ink.cashflow.abstractfactory.factory;

import ink.cashflow.abstractfactory.abztract.Human;
import ink.cashflow.abstractfactory.human.HumanEnum;

public class MaleHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }

    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }

    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloMaleHuman);
    }

}
