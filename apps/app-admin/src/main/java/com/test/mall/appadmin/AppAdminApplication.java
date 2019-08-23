package com.test.mall.appadmin;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringCloudApplication
@ComponentScan(basePackages = {"com.test.mall.common", "com.test.mall.appadmin.controller"})
public class AppAdminApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(AppAdminApplication.class).run(args);
    }

}
