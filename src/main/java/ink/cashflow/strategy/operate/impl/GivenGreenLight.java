package ink.cashflow.strategy.operate.impl;

import ink.cashflow.strategy.operate.IStrategy;

/**
 *求吴国太开个绿灯
 */
public class GivenGreenLight implements IStrategy {
    public void operate() {
        System.out.println("求吴国太,放行！");
    }
}