package ink.cashflow.factory;

public class YellowHuman implements Human {

    @Override
    public void laugh() {
        System.out.println("黄种人大笑!");
    }

    @Override
    public void talk() {
        System.out.println("黄种人谈论!");
    }

    @Override
    public void cry() {
        System.out.println("黄种人哭!");
    }

}
