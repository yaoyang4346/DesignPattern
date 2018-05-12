package ChainOfResponsibilityPattern;

/**
 * Created by cheny on 2018/4/19.
 */
public abstract class Handler {
    public Handler next;

    public abstract void handleRequest(String condition);

    public void setNext(Handler handler){
        next = handler;
    };
}
