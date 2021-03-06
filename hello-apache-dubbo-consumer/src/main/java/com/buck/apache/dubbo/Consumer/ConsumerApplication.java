package com.buck.apache.dubbo.Consumer;

import com.alibaba.csp.sentinel.adapter.dubbo.fallback.DubboFallbackRegistry;
import com.alibaba.csp.sentinel.cluster.ClusterStateManager;
import com.buck.apache.dubbo.Consumer.fallback.ConsumerFallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: hello-apache-dubbo
 * @description:
 * @author: buck
 * @create: 2020-07-15 10:54
 **/

@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        ClusterStateManager.applyState(ClusterStateManager.CLUSTER_CLIENT);
        SpringApplication.run(ConsumerApplication.class,args);
        DubboFallbackRegistry.setConsumerFallback(new ConsumerFallback());
        DubboFallbackRegistry.setProviderFallback(new ConsumerFallback());
    }
}
