package MementoPattern;

import java.util.ArrayList;

/**
 * Created by cheny on 2018/5/12.
 */
public class MementoManager {
    private ArrayList<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
