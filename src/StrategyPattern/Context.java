package StrategyPattern;

/**
 * Created by cheny on 2018/5/12.
 */
public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int request(int req) {
        return strategy.doAction(req);
    }
}
