package BridgePattern;

/**
 * Created by cheny on 2018/4/15.
 */
public class LargeCoffee extends Coffee{
    public LargeCoffee(Additives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("Large coffee + " + impl.addSomething());
    }
}
