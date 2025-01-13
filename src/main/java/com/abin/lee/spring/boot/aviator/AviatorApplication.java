package com.abin.lee.spring.boot.aviator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


/**
 * Created by lee on 2019/8/11.
 */
@Slf4j
//@ServletComponentScan
@SpringBootApplication
public class AviatorApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(AviatorApplication.class, args);
        System.out.println("ヾ(◍°∇°◍)ﾉﾞ    Spring Boot Application Boot SUCCESS   ヾ(◍°∇°◍)ﾉﾞ\n" +
                " ______                    _   ______            \n" +
                "|_   _ \\                  / |_|_   _ `.          \n" +
                "  | |_) |   .--.    .--. `| |-' | | `. \\  .--.   \n" +
                "  |  __'. / .'`\\ \\/ .'`\\ \\| |   | |  | |/ .'`\\ \\ \n" +
                " _| |__) || \\__. || \\__. || |, _| |_.' /| \\__. | \n" +
                "|_______/  '.__.'  '.__.' \\__/|______.'  '.__.'  ");
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AviatorApplication.class);
    }

}