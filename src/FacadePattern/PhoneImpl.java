package FacadePattern;

/**
 * Created by cheny on 2018/4/17.
 */
public class PhoneImpl implements Phone{
    @Override
    public void dial() {
        System.out.println("dial");
    }

    @Override
    public void hangup() {
        System.out.println("hangup");
    }
}
