package VisitorPattern;

/**
 * Created by cheny on 2018/5/12.
 */
public class ElementA implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String actionA1() {
        return "actionA1";
    }

    public String actionA2() {
        return "actionA2";
    }
}
