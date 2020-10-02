package com.mp.exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigClass.class);
//
//        System.out.println(ctx.containsBean("configClass"));
//        System.out.println(ctx.containsBean("hadoopConfiguration"));
//        System.out.println(ctx.containsBean("fsShell"));

//        AppRunner appRunner = (AppRunner) ctx.getBean("appRunner");
//        appRunner.run("");
    }
}
