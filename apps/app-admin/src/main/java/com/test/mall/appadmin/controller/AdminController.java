package com.test.mall.appadmin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "AdminTestController")
@RestController
@RequestMapping("/test")
@Slf4j
public class AdminController {

    @Value("${app}")
    private String app;

    @ApiOperation(value = "Test")
    @GetMapping("/getApp")
    public String getApp(){
        log.info("app");
        return app;
    }
}
