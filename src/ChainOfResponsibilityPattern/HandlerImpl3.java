package ChainOfResponsibilityPattern;

/**
 * Created by cheny on 2018/4/19.
 */
public class HandlerImpl3 extends Handler{
    public static final String CONDITION = "HandlerImpl3";

    @Override
    public void handleRequest(String condition) {
        if (CONDITION.equals(condition)){
            System.out.println("HandlerImpl3 handle");
        }else{
            if(next != null)
                next.handleRequest(condition);
        }
    }
}
