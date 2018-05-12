package Component;

/**
 * Created by cheny on 2018/4/16.
 */
public class AdvancedCoffee extends AdditivesBeverage {
    public AdvancedCoffee(Beverage beverage) {
        super(beverage);
    }

    private void addSugar(){
        System.out.println("add sugar");
    }

    private void addMilk(){
        System.out.println("add milk");
    }

    @Override
    public void make() {
        super.make();
        addSugar();
        addMilk();
    }
}
