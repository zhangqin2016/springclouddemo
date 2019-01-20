package com.rlg.springcloud.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * Created by zhangqin on 2019/1/20.
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientXieYanFeiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientXieYanFeiApplication.class, args);
    }


}
