package ink.cashflow.singleton;

/**
 * 单例 皇帝只有一位
 */
public class Emperor {

    private static Emperor emperor = new Emperor();

    private Emperor() {}

    public static Emperor getInstance() {
        return emperor;
    }

    public static void emperorInfo() {
        System.out.println("皇帝: 芭啦芭啦樱之花");
    }

}
