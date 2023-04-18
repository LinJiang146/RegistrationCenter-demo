package org.example.controller;

import org.example.feign.UserFeignService;
import org.example.loadbalanced.CustomlLoadBalancedConffiguration;
import org.springframework.cloud.client.ServiceInstance;
import org.example.entity.CommonResult;
import org.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("cart")
@LoadBalancerClient(name="service-provider",configuration = CustomlLoadBalancedConffiguration.class )
public class CartController {
    @Autowired
    private UserFeignService userFeignService;

    @GetMapping("/hello")
    public String hello(){
        return userFeignService.Hello();
    }

    @GetMapping("/addCart/{userId}")
    public CommonResult<User> addCart(@PathVariable Integer userId){

        return userFeignService.getUserById(userId);
    }
}
