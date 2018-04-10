package com.outab.tiger.web.test.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Author: 周易(yi.zhou)
 * @Date: 2017/12/20 下午3:12
 * @Description:
 */
@Aspect
public class TestAdvisor {
    @Pointcut("execution(* *.test(..))")
    public void test() {
        System.out.println("this is testtest");
    }
    @Before("test()")
    public void beforeTest(){
        System.out.println("beforeTest");
    }
    @After("test()")
    public void afterTest(){
        System.out.println("afterTest");
    }
    @Around("test()&&@annotation(Deprecated)")
    public Object aroundTest(ProceedingJoinPoint p){
        System.out.println("before1");
        Object o = null;
        try {
            o = p.proceed() ;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("affter1");
        return o;
    }
    @AfterThrowing("test()")
    public void throwTest(){

    }
    @AfterReturning("test()")
    public void returnTest(){

    }
}
