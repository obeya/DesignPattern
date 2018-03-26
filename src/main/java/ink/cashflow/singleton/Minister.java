package ink.cashflow.singleton;

/**
 * 大臣看到都是同一个皇帝
 */
@SuppressWarnings("all")
public class Minister {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Emperor emperor1 = Emperor.getInstance();
        emperor1.emperorInfo();
        
        Emperor emperor2 = Emperor.getInstance();
        emperor2.emperorInfo();
        
        Emperor emperor3 = Emperor.getInstance();
        emperor3.emperorInfo();
    }
}