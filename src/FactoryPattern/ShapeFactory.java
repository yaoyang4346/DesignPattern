package FactoryPattern;

/**
 * Created by cheny on 2018/4/10.
 */
public class ShapeFactory {
    public Shape getShape(String type){
        if(type == null)
            return null;
        switch (type){
            case "triangle":
                return new Triangle();
            case "circle":
                return new Circle();
             default:
                 return null;
        }
    }
}
