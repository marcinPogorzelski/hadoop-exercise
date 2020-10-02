package com.mp.exercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigClass.class);

        System.out.println(ctx.containsBean("configClass"));
        System.out.println(ctx.containsBean("hadoopConfiguration"));
        System.out.println(ctx.containsBean("fsShell"));

//        AppRunner appRunner = (AppRunner) ctx.getBean("appRunner");
//        appRunner.run("");
    }
}
