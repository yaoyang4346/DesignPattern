package ObserverPattern;

/**
 * Created by cheny on 2018/5/12.
 */
public class ObserverB extends Observer{
    @Override
    public void update(String msg) {
        System.out.println("ObserverB: " + msg);
    }
}
