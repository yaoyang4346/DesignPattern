package FlyweightPattern;

import java.util.HashMap;

/**
 * Created by cheny on 2018/4/18.
 */
public class ShapeFactory {
    private static final HashMap<String,Shape> map = new HashMap<>();

    public static Shape getCircle(String color){
        Circle circle = (Circle) map.get(color);

        if(circle == null){
            circle = new Circle(color);
            map.put(color,circle);
            System.out.println("create circle : " + color);
        }

        return circle;
    }
}
