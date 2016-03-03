package com.caveofprogramming.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

    @Pointcut("execution(* com.caveofprogramming.spring.aop.Camera.*(..))")
    public void cameraSnap() {
    }

    @Pointcut("execution(String com.caveofprogramming.spring.aop.Camera.snap(String))")
    public void cameraSnapName() {
    }

//    @Pointcut("execution(* com.caveofprogramming.spring.aop.*.*(..))")
    @Pointcut("execution(* *.*(..))")
    public void cameraRelatedAction() {
    }

    @Before("cameraSnap()")
    public void aboutToTakePhoto() {
        System.out.println("About to take a photo...");
    }

    @Before("cameraSnapName()")
    public void aboutToTakePhotoWithName() {
        System.out.println("About to take a photo with name...");
    }

    @Before("cameraRelatedAction()")
    public void aboutToDoCameraRelatedAction() {
        System.out.println("Doing something related to cameras...");
    }

}
