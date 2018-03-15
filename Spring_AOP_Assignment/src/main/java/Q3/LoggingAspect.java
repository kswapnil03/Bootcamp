package Q3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

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



}
