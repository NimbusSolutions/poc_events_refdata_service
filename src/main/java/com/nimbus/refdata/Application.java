package com.nimbus.refdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Kye on 01/05/15.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.nimbus"})
public class Application {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(Application.class, args);
    }

}
