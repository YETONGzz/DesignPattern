package com.yetong;

import com.yetong.MediatorPattern.Button;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.yetong"})
public class RunStart {

    @Autowired
    Button button;

    public static void main(String[] args) {
        SpringApplication.run(RunStart.class);
    }
}
