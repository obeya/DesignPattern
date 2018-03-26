package ink.cashflow.strategy.execute;

import ink.cashflow.strategy.context.Context;
import ink.cashflow.strategy.operate.impl.BackDoor;
import ink.cashflow.strategy.operate.impl.BlockEnemy;
import ink.cashflow.strategy.operate.impl.GivenGreenLight;

/**
 * 赵云执行锦囊
 */
public class ZhaoYun {

    public static void main(String[] args) {

        Context context = null;

        System.out.println("%%%% 拆第一个 %%%%");
        context = new Context(new BackDoor());
        context.operate();

        System.out.println("%%%% 拆第二个 %%%%");
        context = new Context(new BlockEnemy());
        context.operate();
        
        System.out.println("%%%% 拆第三个 %%%%");
        context = new Context(new GivenGreenLight());
        context.operate();

    }
}
