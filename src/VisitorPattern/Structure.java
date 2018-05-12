package VisitorPattern;

import java.util.ArrayList;

/**
 * Created by cheny on 2018/5/12.
 */
public class Structure {
    private ArrayList<Element> elementList = new ArrayList<>();

    public void action(Visitor visitor) {
        for (Element e : elementList) {
            e.accept(visitor);
        }
    }

    public void add(Element e) {
        elementList.add(e);
    }
}
