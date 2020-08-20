package com.buck.apache.dubbo.Consumer.controller;

import com.buck.apache.dubbo.provider.api.EchoService;
import com.buck.apache.dubbo.provider.api.UserService;
import com.buck.apache.dubbo.provider.pojo.User;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: hello-apache-dubbo
 * @description:
 * @author: buck
 * @create: 2020-07-15 10:55
 **/

@RestController
public class EchoController {

    @Reference(version = "1.0.0")
    private EchoService echoService;

    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping("/echo/{string}")
    public String echo(@PathVariable(value = "string") String string){
        return "Hello Dubbo " + echoService.echo(string);
    }

    @GetMapping("/user")
    public User getUser(){
        return userService.getUser();
    }
}
