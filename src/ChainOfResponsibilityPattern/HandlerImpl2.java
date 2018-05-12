package ChainOfResponsibilityPattern;

/**
 * Created by cheny on 2018/4/19.
 */
public class HandlerImpl2 extends Handler{
    public static final String CONDITION = "HandlerImpl2";

    @Override
    public void handleRequest(String condition) {
        if (CONDITION.equals(condition)){
            System.out.println("HandlerImpl2 handle");
        }else{
            if(next != null)
                next.handleRequest(condition);
        }
    }
}
