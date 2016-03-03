package com.caveofprogramming.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
    @After("execution(void com.caveofprogramming.spring.aop.Camera.snap())")
    public void aboutToTakePhoto(){
        System.out.println("About to take a photo...");
    }
}
