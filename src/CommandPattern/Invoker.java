package CommandPattern;

import java.util.ArrayList;

/**
 * Created by cheny on 2018/5/9.
 */
public class Invoker {
    private ArrayList<Command> list = new ArrayList<>();

    public void setCommand(Command command){
        list.add(command);
    }

    public void execute(){
        for (Command command : list)
            command.execute();
    }
}
