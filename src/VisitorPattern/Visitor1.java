package VisitorPattern;

/**
 * Created by cheny on 2018/5/12.
 */
public class Visitor1 implements Visitor {
    @Override
    public void visit(ElementA e) {
        System.out.println(e.actionA1());
    }

    @Override
    public void visit(ElementB e) {
        System.out.println(e.actionB1());
    }
}
