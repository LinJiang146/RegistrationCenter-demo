package cn.itcast.user;

import cn.itcast.user.config.JdbcConfig;
import cn.itcast.user.config.PatternProperties;
import cn.itcast.user.config.SpringConfig;
import cn.itcast.user.web.A;
import cn.itcast.user.web.B;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class app {
    public static void main(String[] args) {
        //获取ioc容器 可多文件用,分隔
   //
        //     ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext1.xml");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        //获取bean
//        B b = (B) ctx.getBean("abc");
//        b.msg();
        //默认为单例
        //ctx.getBean(A.class);
//        A a = (A) ctx.getBean("abc");
//        a.getMsg();
        System.out.println(ctx.getBean(JdbcConfig.class).abc);
        System.out.println(ctx.getBean(JdbcConfig.class).url);
        System.out.println(ctx.getBean(PatternProperties.class).getDateformat());
//        System.out.println(ctx.getBean("mysql"));
        //会销毁bean
       // ctx.close();
    }
}
