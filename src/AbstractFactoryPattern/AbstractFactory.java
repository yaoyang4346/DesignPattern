package AbstractFactoryPattern;

/**
 * Created by cheny on 2018/4/11.
 */
interface AbstractFactory {
    AbstractProductA createProductA();

    AbstractProductB createProductB();
}
