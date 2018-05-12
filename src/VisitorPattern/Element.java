package VisitorPattern;

/**
 * Created by cheny on 2018/5/12.
 */
interface Element {
    void accept(Visitor visitor);
}
