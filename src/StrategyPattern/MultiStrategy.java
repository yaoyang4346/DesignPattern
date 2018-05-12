package StrategyPattern;

/**
 * Created by cheny on 2018/5/12.
 */
public class MultiStrategy implements Strategy {
    @Override
    public int doAction(int req) {
        return req * req;
    }
}
