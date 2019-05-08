package com.gaojian.eurekaservicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class EurekaServiceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceZuulApplication.class, args);
    }

}
