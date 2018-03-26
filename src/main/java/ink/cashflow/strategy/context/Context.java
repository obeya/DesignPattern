package ink.cashflow.strategy.context;

import ink.cashflow.strategy.operate.IStrategy;

/**
 * 上下文
 */
public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        this.strategy.operate();
    }

}
