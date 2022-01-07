package com.javadevmap.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectjBean {
    @Pointcut("execution(* com.javadevmap.service.ProductService.*(..))") // expression
    private void businessService() {
    }
    @Before("businessService()")
    public void beforeAdvice() {
        System.out.println("beforeAdvice() --> Going to exec addProduct.");
    }
    @After("businessService()")
    public void afterAdvice() {
        System.out.println("afterAdvice() --> addProduct has been done.");
    }
    @AfterReturning(pointcut = "businessService()", returning = "retVal")
    public void afterReturningAdvice(Object retVal) {
        System.out.println("afterReturningAdvice() -->Returning");
    }
    @AfterThrowing(pointcut = "businessService()", throwing = "ex")
    public void AfterThrowingAdvice(IllegalArgumentException ex) {
        System.out.println("AfterThrowingAdvice--> There has been an exception: " + ex.toString());
    }
    
    
//    // 前置通知
//    public void before(JoinPoint jp) {
//        System.out.println("--------------->前置通知<-----------------");
//        System.out.println("方法名：" + jp.getSignature().getName() + ",参数长度：" + jp.getArgs() + ",被代理对象："
//                + jp.getTarget().getClass().getName());
//    }
//
//    // 后置通知
//    public void after(JoinPoint jp) {
//        System.out.println("--------------->后置通知<-----------------");
//    }
//
//    // 环绕通知
//    public Object around(ProceedingJoinPoint pjd) throws Throwable {
//        System.out.println("--------------->环绕开始<-----------------");
//        Object object = pjd.proceed();
//        System.out.println("--------------->环绕结束<-----------------");
//        return object;
//
//    }
//
//    // 异常后通知
//    public void afterThrowing(JoinPoint joinPoint, Exception exp) {
//        System.out.println("--------------->异常后通知，发生了异常:" + exp.getMessage());
//
//    }
//
//    // 返回结果后通知
//    public void afterReturning(JoinPoint joinPoint, Object result) {
//        System.out.println("--------------->返回结果后通知<-----------------");
//        System.out.println("结果是:" + result);
//    }
}
