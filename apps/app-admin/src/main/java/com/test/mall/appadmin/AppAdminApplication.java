package com.test.mall.appadmin;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringCloudApplication
@ComponentScan(basePackages = {"com.test.mall.common.config"})
public class AppAdminApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(AppAdminApplication.class).run(args);
    }

}
