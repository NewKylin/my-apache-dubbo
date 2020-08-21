package com.buck.apache.dubbo.provider.service;

import com.buck.apache.dubbo.provider.api.UserService;
import com.buck.apache.dubbo.provider.pojo.User;
import org.apache.dubbo.config.annotation.Service;

/**
 * @program: hello-apache-dubbo
 * @description:
 * @author: buck
 * @create: 2020-07-17 15:58
 **/
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public int addUser(User user) {
        return 1;
    }

    @Override
    public User getUser() {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        User user = new User();
        user.setAddress("广西南宁");
        user.setAge(19);
        user.setName("严讯");
        user.setPhone("888888888");
        return user;
    }
}
