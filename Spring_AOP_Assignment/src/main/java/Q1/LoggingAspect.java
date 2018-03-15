package Q1;

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
    public void allMethod(){}

    @Before("allMethod()")
    public void beforeCalled(){
        System.out.println("this method called before the execution of any method of service class");
    }

}
