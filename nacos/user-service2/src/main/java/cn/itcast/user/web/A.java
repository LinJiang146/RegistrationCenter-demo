package cn.itcast.user.web;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@RefreshScope
@Component
public class A {
    @Autowired
    @Qualifier("B")//多个相同类型bean要用名称指定
    private Ib b;

    @Value("${jdbc.drive}")
    private String database;
//    private int num;

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getDatabase(){
        return database;
    }

    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }
//    public A() {
//    }

//    public A(Ib b, String database, int num) {
//        this.b = b;
//        this.database = database;
//        this.num = num;
//    }




    public void getMsg(){
        System.out.println(database);
        b.msg();
    }
    public void setB(Ib b){
        this.b = b;
    }
}
