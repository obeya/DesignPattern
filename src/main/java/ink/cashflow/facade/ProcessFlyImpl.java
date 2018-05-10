package ink.cashflow.facade;

public class ProcessFlyImpl implements ProcessFly {

    @Override
    public void start(String str) {
        System.out.println("开始: " + str);
    }

    @Override
    public void end(String str) {
        System.out.println("结束: " + str);
    }

}
