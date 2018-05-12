package MediatorPattern;

/**
 * Created by cheny on 2018/5/10.
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        Mediator.showMessage(this,message);
    }
}
