package StatePattern;

/**
 * Created by cheny on 2018/5/12.
 */
public class PowerOnState implements State{
    @Override
    public void next() {
        System.out.println("上一个...");
    }

    @Override
    public void pre() {
        System.out.println("下一个...");
    }


}
