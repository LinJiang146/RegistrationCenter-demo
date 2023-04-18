package org.example.feign;


import org.example.entity.CommonResult;
import org.example.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("service-provider")
public interface UserFeignService {

    @GetMapping("/user/getUserById/{userId}")
    public CommonResult<User> getUserById(@PathVariable("userId") Integer userId);

    @GetMapping("/user/hello")
    public String Hello();

}
