package FactoryPattern;

/**
 * Created by cheny on 2018/4/10.
 */
public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("circle");
        shape.draw();
    }
}
