package TemplatePattern;

/**
 * Created by cheny on 2018/5/12.
 */
public abstract class Template {
    public void step1(){
        System.out.println("step1 run...");
    }

    public void step2(){
        System.out.println("step2 run...");
    }

    public void step3(){
        System.out.println("step3 run...");
    }

    public void run(){
        step1();
        step2();
        step3();
    }
}
