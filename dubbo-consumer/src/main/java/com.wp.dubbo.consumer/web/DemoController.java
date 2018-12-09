package com.wp.dubbo.consumer.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wp.dubbo.api.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wp
 * @create 2018-12-09 15:39
 **/
@RestController
public class DemoController {
    @Reference
    private DemoService demoService;

    @GetMapping(value = "/sayHello")
    public String sayHello(@RequestParam String name){
        return demoService.sayHello(name);
    }
}
