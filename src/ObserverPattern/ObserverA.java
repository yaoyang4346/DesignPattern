package ObserverPattern;

/**
 * Created by cheny on 2018/5/12.
 */
public class ObserverA extends Observer{
    @Override
    public void update(String msg) {
        System.out.println("ObserverA: " + msg);
    }
}
