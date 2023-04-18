package cn.wei.gateway;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Order(1)//执行顺序，越小越先,可用Ordered接口代替
@Component
public class AuthorizeFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        //1. 获取请求参数
        ServerHttpRequest request = exchange.getRequest();


        //2.获取参数
        MultiValueMap<String, String> params = request.getQueryParams();
        String authorization = params.getFirst("authorization");

        if ("admin".equals(authorization)){
            //放行,到下一个过滤器
            return chain.filter(exchange);
        }
        //设置状态码
        exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
        //拦截，结束请求
        return exchange.getResponse().setComplete();
    }
}
