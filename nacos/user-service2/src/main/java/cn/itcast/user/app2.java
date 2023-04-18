package cn.itcast.user;

import cn.itcast.user.config.SpringConfig;
import cn.itcast.user.web.A;
import cn.itcast.user.web.B;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class app2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        B b = (B) ctx.getBean("B");
        b.msg();

        A a = (A) ctx.getBean(A.class);
        a.getMsg();
        System.out.println(ctx.getBean("dataSource"));
    }
}
