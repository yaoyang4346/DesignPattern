package FlyweightPattern;

/**
 * Created by cheny on 2018/4/18.
 */
public class Circle implements Shape{
    private String color;
    private int x,y,r;

    public Circle(String color){
        this.color = color;
    }

    public void setXYR(int x,int y,int r){
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("draw circle: x = " + x + " , y = " + y + " , r = " + r + " , color = " + color);
    }
}
