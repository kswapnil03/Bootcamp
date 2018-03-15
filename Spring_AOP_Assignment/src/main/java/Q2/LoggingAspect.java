package Q2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class LoggingAspect {

    @Pointcut("execution(* Service.*(..))")
    public void allMethods(){}


    @Before("allMethods()")
    public void beforeCalled(){
        System.out.println("this method called before the execution of any method of service class");
    }


    @After("allMethods()")
    public void afterCalled(){
        System.out.println("this method called after the execution of any method of service class");
    }

}
