package MediatorPattern;

import java.util.Date;

/**
 * Created by cheny on 2018/5/10.
 */
public class Mediator {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
