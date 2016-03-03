package com.caveofprogramming.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

    @Pointcut("execution(void com.caveofprogramming.spring.aop.Camera.snap(..))")
    public void cameraSnap(){
    }

    @Pointcut("execution(void com.caveofprogramming.spring.aop.Camera.snap(String))")
    public void cameraSnapName(){

    }

    @Before("cameraSnap()")
    public void aboutToTakePhoto(){
        System.out.println("About to take a photo...");
    }

    @Before("cameraSnapName()")
    public void aboutToTakePhoto(){
        System.out.println("About to take a photo with name...");
    }
}
