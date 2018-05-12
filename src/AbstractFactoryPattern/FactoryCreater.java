package AbstractFactoryPattern;

/**
 * Created by cheny on 2018/4/11.
 */
public class FactoryCreater {
    public static AbstractFactory getFactory(String type){
        switch (type){
            case "1":
                return new Factory1();
            case "2":
                return new Factory2();
            default:
                return null;
        }
    }
}
