package ProxyPattern;

/**
 * Created by cheny on 2018/4/19.
 */
public class RealProduct implements Product{
    @Override
    public void fun() {
        System.out.println("form realProduct");
    }
}
