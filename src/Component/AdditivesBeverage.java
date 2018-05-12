package Component;

/**
 * Created by cheny on 2018/4/16.
 */
public abstract class AdditivesBeverage implements Beverage{
    private Beverage beverage;

    public AdditivesBeverage(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public void make() {
        beverage.make();
    }
}
