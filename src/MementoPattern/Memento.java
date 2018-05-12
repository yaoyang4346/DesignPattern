package MementoPattern;

/**
 * Created by cheny on 2018/5/10.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
