package ink.cashflow.abstractfactory.human;

import ink.cashflow.abstractfactory.abztract.AbstractBlackHuman;

public class BlackMaleHuman extends AbstractBlackHuman {

    @Override
    public void sex() {
        
        System.out.println("黑人: 男性");
    }



}
