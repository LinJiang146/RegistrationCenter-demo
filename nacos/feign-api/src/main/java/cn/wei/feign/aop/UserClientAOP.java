package cn.wei.feign.aop;

//import cn.wei.feign.pojo.User;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//public class UserClientAOP {
//
//    @Pointcut("execution(* cn.wei.feign.clients.UserClient.findById(..))")
//    private void pt(){}
//
//
//
//    @Around("pt()")
//    public Object TheWorld(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        Thread.sleep(100);
//        Object r = proceedingJoinPoint.proceed();
//        System.out.println("aop生效");
//        return r;
//    }
//}
