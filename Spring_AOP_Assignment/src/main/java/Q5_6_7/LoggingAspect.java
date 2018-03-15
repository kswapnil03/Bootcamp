package Q5_6_7;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class LoggingAspect {

    @Pointcut("execution(* Service.*(..))")
    public void allMethods(){}


    @AfterThrowing(pointcut = "allMethods()" ,throwing = "error")

    public void myadvice(JoinPoint jp,Throwable error)//it is advice and note Throwable parameter should be last parameter
    {


        System.out.println("additional concern");
        System.out.println("Method Signature: "  + jp.getSignature());
        System.out.println("Exception is: "+error);
        System.out.println("end of after throwing advice...");
    }

    @After("args(int )")
    public void callAfter(){
        System.out.println("calling after with args");
    }

    @Before("this(Service)")
    public void callBefore(){
        System.out.println("calling before with this");
    }

    @After("within(Service)")
    public void callAfter2(){
        System.out.println("call after within");
    }

    @Before("target(Service)")
    public void c(){
        System.out.println("calling before with target");
    }

}
