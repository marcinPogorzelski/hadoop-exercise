package com.mp.exercise;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.hadoop.config.annotation.EnableHadoop;
import org.springframework.data.hadoop.config.annotation.SpringHadoopConfigurerAdapter;
import org.springframework.data.hadoop.config.annotation.builders.HadoopConfigConfigurer;

@Configuration
@EnableHadoop
public class ConfigClass extends SpringHadoopConfigurerAdapter {
    @Override
    public void configure(HadoopConfigConfigurer config) {
        config.loadDefaults(true);
    }
}
