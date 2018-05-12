package CommandPattern;


/**
 * Created by cheny on 2018/5/9.
 */
public class ConcreteCommand1 implements Command{
    private Receiver receiver;

    public ConcreteCommand1(Receiver receive){
        this.receiver = receive;
    }

    @Override
    public void execute() {
        receiver.action1();
    }
}
