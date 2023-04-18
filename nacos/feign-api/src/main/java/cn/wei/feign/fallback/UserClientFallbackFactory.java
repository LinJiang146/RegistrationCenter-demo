package cn.wei.feign.fallback;

import cn.wei.feign.clients.UserClient;
import cn.wei.feign.pojo.User;
import feign.hystrix.FallbackFactory;


public class UserClientFallbackFactory implements FallbackFactory<UserClient> {
    @Override
    public UserClient create(Throwable cause) {
        return new UserClient() {
            @Override
            public User findById(Long id) {
                System.out.println("查询异常");
                return new User();
            }
        };
    }
}
