package ink.cashflow.multition;

import java.util.ArrayList;
import java.util.Random;


/**
 * 多例模式, 多个皇上
 */
@SuppressWarnings("all")
public class Emperor {

    // 最多两个皇帝
    private static int maxNumOfEmperor = 2;

    // 皇帝的名称
    private static ArrayList emperorInfoList = new ArrayList(maxNumOfEmperor);

    // 装皇帝的列表
    private static ArrayList emperorList = new ArrayList(maxNumOfEmperor);

    private static int countNumOfEmperor = 0; // 当前的皇帝

    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorList.add(new Emperor("第" + (i + 1) + "皇帝!"));
        }
    }

    private Emperor() {
    }

    private Emperor(String emperorInfo) {
        emperorInfoList.add(emperorInfo);
    }

    public static Emperor getInstance() {
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return (Emperor) emperorList.get(countNumOfEmperor);
    }

    public static Emperor getInstance(int emperor) {
        return (Emperor) emperorList.get(emperor);
    }

    public void getInfo() {
        System.out.println(emperorInfoList.get(countNumOfEmperor));
    }

}
