package cn.itcast.user.web;

public class bFactory {
    public static B getB(){
        System.out.println("gc");
        return new B();
    }
}
