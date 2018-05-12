package VisitorPattern;

/**
 * Created by cheny on 2018/5/12.
 */
public class ElementB implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String actionB1() {
        return "actionB1";
    }

    public String actionB2() {
        return "actionB2";
    }
}
