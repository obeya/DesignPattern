package ink.cashflow.abstractfactory.human;

public enum HumanEnum {

    YelloMaleHuman("ink.cashflow.abstractfactory.human.YellowMaleHuman"),
    YellowFemaleHuman("ink.cashflow.abstractfactory.human.YellowFemaleHuman"),
    WhiteFemaleHuman("ink.cashflow.abstractfactory.human.WhiteFemaleHuman"),
    WhiteMaleHuman("ink.cashflow.abstractfactory.human.WhiteMaleHuman"),
    BlackFemaleHuman("ink.cashflow.abstractfactory.human.BlackFemaleHuman"),
    BlackMaleHuman("ink.cashflow.abstractfactory.human.BlackMaleHuman");
    
    private String value = "";
    
    private HumanEnum(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return this.value;
    }
    
}
