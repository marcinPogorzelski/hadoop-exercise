package com.mp.exercise;

import org.apache.hadoop.fs.FileStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.hadoop.fs.FsShell;

import java.util.List;

public class AppRunner implements CommandLineRunner {

    @Autowired
    private FsShell shell;

    public void run(String... strings) throws Exception {
        List<FileStatus> fsList = (List<FileStatus>) shell.lsr("/data");
        for (FileStatus fs : fsList) {
            System.out.println(fs.getPath().toString());
        }
    }
}
