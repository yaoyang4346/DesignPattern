package AbstractFactoryPattern;

/**
 * Created by cheny on 2018/4/11.
 */
public class Factory2 implements AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
