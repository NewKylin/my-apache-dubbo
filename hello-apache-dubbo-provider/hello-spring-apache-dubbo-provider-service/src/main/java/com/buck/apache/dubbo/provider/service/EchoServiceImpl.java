package com.buck.apache.dubbo.provider.service;


import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.buck.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @program: hello-apache-dubbo
 * @description:
 * @author: buck
 * @create: 2020-07-14 17:35
 **/

@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {

    @Value("${dubbo.protocol.port}")
    private String port;

    @Override
    @SentinelResource(value = "echo",fallback = "echoFallback")
    public String echo(String str) {
        if (str.equals("321"))
            throw new IllegalArgumentException("invalid arg");
        return "Echo hello from port:" + port;
    }
    public String echoFallback(String str,Throwable ex){
        System.out.println("异常了");
        return "系统繁忙，请稍后再试！";
    }
}
