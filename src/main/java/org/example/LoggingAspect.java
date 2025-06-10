package org.example;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* UserService.authenticate(..))")
    public void logBefore() {
        System.out.println("用户认证方法被调用");
    }
}
