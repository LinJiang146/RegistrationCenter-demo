package cn.itcast.user.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//value用于用于SpringIOC调用，可以为任意，和bean的id作用一样
//Scope和配置文件中的Scope一致，这里的意思为创建的实例对象为多实例。
@Component(value = "person")
@Scope(value = "prototype")
public class Person
{
    public String test(){
        return "text";
    }
}
