package com.buck.apache.dubbo.Consumer.fallback;

import com.alibaba.csp.sentinel.adapter.dubbo.fallback.DubboFallback;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.apache.dubbo.rpc.AppResponse;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.Result;

/**
 * @program: hello-apache-dubbo
 * @description:
 * @author: buck
 * @create: 2020-08-21 10:59
 **/
public class ConsumerFallback implements DubboFallback {
    @Override
    public Result handle(Invoker<?> invoker, Invocation invocation, BlockException e) {
        System.out.println("你的网络有问题");
        return new AppResponse("你的网络有问题");
    }
}
