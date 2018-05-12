package ObserverPattern;

import java.util.ArrayList;

/**
 * Created by cheny on 2018/5/12.
 */
public class Observable {
    private ArrayList<Observer> observers = new ArrayList<>();
    public void sendMsg(String msg) {
        notifyAll(msg);
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyAll(String msg) {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }
}
