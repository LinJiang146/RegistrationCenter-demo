package cn.itcast.user.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("B")
//@Scope("prototype")
public class B implements Ib{
    public void msg(){
        System.out.println("abc");
    }
    B(){
        System.out.println("ddd");
    }
//    @PostConstruct
//    @PreDestroy
    public void abc(){
        System.out.println("aaa");
    }
}
