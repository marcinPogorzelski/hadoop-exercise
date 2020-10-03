package com.mp.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.hadoop.fs.FsShell;

@SpringBootApplication
public class StartApplication implements CommandLineRunner {

    @Autowired
    private FsShell shell;

    @Override
    public void run(String... strings) {
        shell.mkdir("/data/marcin/example");
        shell.lsr("/data").forEach(fileStatus -> System.out.println(fileStatus.getPath().toString()));
        shell.rm(true,true,"/data/marcin");
    }


    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}
