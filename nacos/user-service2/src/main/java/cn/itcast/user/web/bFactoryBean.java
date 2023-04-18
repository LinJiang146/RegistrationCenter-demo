package cn.itcast.user.web;

import org.springframework.beans.factory.FactoryBean;

public class bFactoryBean implements FactoryBean<B> {
    @Override
    public B getObject() throws Exception {
        System.out.println("gcbean");
        return new B();
    }

    @Override
    public Class<?> getObjectType() {
        return B.class;
    }
}
