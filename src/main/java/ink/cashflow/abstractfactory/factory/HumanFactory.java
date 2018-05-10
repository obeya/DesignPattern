package ink.cashflow.abstractfactory.factory;

import ink.cashflow.abstractfactory.abztract.Human;

public interface HumanFactory {

    Human createBlackHuman();

    Human createWhiteHuman();

    Human createYellowHuman();

}
