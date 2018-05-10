package ink.cashflow.abstractfactory.factory;

import ink.cashflow.abstractfactory.abztract.Human;
import ink.cashflow.abstractfactory.human.HumanEnum;


public abstract class AbstractHumanFactory implements HumanFactory {

    public static Human createHuman(HumanEnum humanEnum) {

        Human human = null;

        if (!"".equals(humanEnum.getValue())) {

            try {
                String name = humanEnum.getValue();
                human = (Human) Class.forName(humanEnum.getValue()).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return human;
    }

}
