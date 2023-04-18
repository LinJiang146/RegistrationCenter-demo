package cn.itcast.user.config;

import cn.itcast.user.web.B;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class JdbcConfig {

    @Value("${jdbc.url}")
    public String url;

    @Value("${pattern.dateformat}")
    public String abc;
    //管理第三方bean
//    @Bean("dataSource")//返回的对象成为bean
//    public DataSource dataSource(B b){//引用类型形参自动装配
//        System.out.println(b);
//        DruidDataSource ds = new DruidDataSource();
//        ds.setDriverClassName("com.mysql.jdbc.Driver");
//        ds.setUrl(url);
//        ds.setUsername("root");
//        ds.setPassword("root");
//        return ds;
//    }
}
