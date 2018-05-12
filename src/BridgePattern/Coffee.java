package BridgePattern;

/**
 * Created by cheny on 2018/4/15.
 */
public abstract class Coffee {
    protected Additives impl;
    public Coffee(Additives impl){
        this.impl = impl;
    }

    public abstract void makeCoffee();
}
