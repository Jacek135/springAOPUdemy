package com.caveofprogramming.spring.aop;

import com.caveofprogramming.spring.aop.camera.accessories.Lens;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main (String [] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/aop/bean.xml");

        Camera camera = (Camera)context.getBean("camera");
        Lens lens = (Lens)context.getBean("lens");

        camera.snap();
        camera.snap(1000);
        camera.snap("Prauge castle");
        camera.snapNightime();

        lens.zoom(5);

        context.close();
    }
}