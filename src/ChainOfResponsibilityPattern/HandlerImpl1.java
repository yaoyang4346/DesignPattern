package ChainOfResponsibilityPattern;

/**
 * Created by cheny on 2018/4/19.
 */
public class HandlerImpl1 extends Handler{
    public static final String CONDITION = "HandlerImpl1";

    @Override
    public void handleRequest(String condition) {
        if (CONDITION.equals(condition)){
            System.out.println("HandlerImpl1 handle");
        }else{
            if(next != null)
                next.handleRequest(condition);
        }
    }
}
