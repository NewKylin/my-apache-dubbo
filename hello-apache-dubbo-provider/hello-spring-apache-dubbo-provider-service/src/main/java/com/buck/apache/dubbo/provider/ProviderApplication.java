package com.buck.apache.dubbo.provider;

import com.alibaba.csp.sentinel.cluster.ClusterStateManager;
import com.alibaba.csp.sentinel.cluster.client.config.ClusterClientAssignConfig;
import com.alibaba.csp.sentinel.cluster.client.config.ClusterClientConfig;
import com.alibaba.csp.sentinel.cluster.client.config.ClusterClientConfigManager;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @program: hello-apache-dubbo
 * @description:
 * @author: buck
 * @create: 2020-07-14 17:33
 **/
@SpringBootApplication
@MapperScan("com.buck.apache.dubbo.provider.mapper")
public class ProviderApplication {
    public static void main(String[] args) {

        ClusterStateManager.applyState(ClusterStateManager.CLUSTER_CLIENT);
        SpringApplication.run(ProviderApplication.class,args);
        ClusterClientConfig clusterClientConfig = new ClusterClientConfig();
        clusterClientConfig.setRequestTimeout(1000);
        ClusterClientAssignConfig clusterClientAssignConfig = new ClusterClientAssignConfig();
        clusterClientAssignConfig.setServerHost("127.0.0.1");
        clusterClientAssignConfig.setServerPort(11111);
        ClusterClientConfigManager.applyNewAssignConfig(clusterClientAssignConfig);
        ClusterClientConfigManager.applyNewConfig(clusterClientConfig);
    }
}
