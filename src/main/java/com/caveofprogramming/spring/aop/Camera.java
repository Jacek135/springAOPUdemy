package com.caveofprogramming.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Camera {
    public void snap(){
        System.out.println("SNAP");
    }

    public void snap(int exposure){
        System.out.println("SNAP!! Exposure: " + exposure );
    }

    public String snap(String name){
        System.out.println("SNAP!! Name: " + name );

        return name;
    }

    public void snapNightime(){
        System.out.println("SNAP!! Night Mode.");
    }
}