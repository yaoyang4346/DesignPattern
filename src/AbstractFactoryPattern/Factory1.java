package AbstractFactoryPattern;

/**
 * Created by cheny on 2018/4/11.
 */
public class Factory1 implements AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
