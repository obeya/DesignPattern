package ink.cashflow.builder;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        // 1W辆A类型的奔驰车
        for (int i = 0; i < 10000; i++) {
            director.getABenzModel().run();
        }
    }
}
