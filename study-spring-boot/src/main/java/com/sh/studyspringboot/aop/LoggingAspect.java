package com.sh.studyspringboot.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Around("@annotation(com.sh.studyspringboot.aop.annotation.LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object result = joinPoint.proceed(); // gọi method gốc

        long end = System.currentTimeMillis();
        System.out.println("⏱ " + joinPoint.getSignature() + " executed in " + (end - start) + "ms");

        return result;
    }
}
