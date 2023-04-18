package cn.itcast.user.web;

import org.springframework.stereotype.Component;

@Component("C")
//@Scope("prototype")
public class C implements Ib{
    public void msg(){
        System.out.println("abc");
    }
    C(){
        System.out.println("ddd");
    }
//    @PostConstruct
//    @PreDestroy
    public void abc(){
        System.out.println("aaa");
    }
}
