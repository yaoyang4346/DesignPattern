package PrototypePattern;

import java.util.ArrayList;

/**
 * Created by cheny on 2018/4/14.
 */
public class Product implements Cloneable{
    private String name ;
    private int id;
    private ArrayList<String> list = new ArrayList<>();

    public Product(String name,int id){
        System.out.println("构造函数");
        this.name = name;
        this.id = id;
    }

    public void addItem(String name){
        list.add(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public Product clone() {
        try {
            Product clone = (Product) super.clone();
            clone.id = this.id;
            clone.name = this.name;
            clone.list = (ArrayList<String>) this.list.clone();
            return clone;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "name: " + name + " id: " + id + " list: " + list.toString();
    }
}
