package BridgePattern;

/**
 * Created by cheny on 2018/4/15.
 */
public class SmallCoffee extends Coffee{
    public SmallCoffee(Additives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("small coffee + " + impl.addSomething());
    }
}
