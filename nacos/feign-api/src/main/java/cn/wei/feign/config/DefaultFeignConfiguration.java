package cn.wei.feign.config;

import cn.wei.feign.fallback.UserClientFallbackFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Configuration
@EnableAspectJAutoProxy
public class DefaultFeignConfiguration {

    @Bean
    public UserClientFallbackFactory userClientFallbackFactory(){

        return new UserClientFallbackFactory();
    }
}
