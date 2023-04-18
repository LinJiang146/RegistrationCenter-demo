package cn.itcast.user.config;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@RefreshScope
@Configuration
@ComponentScan({"cn.itcast.user.web","cn.itcast.user.pojo"})
@PropertySource({"classpath:jdbc.properties"})
@Import({JdbcConfig.class , PatternProperties.class})
public class SpringConfig {

}
