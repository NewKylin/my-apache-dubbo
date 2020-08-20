package com.buck.apache.dubbo.provider.api;

import com.buck.apache.dubbo.provider.pojo.User;

public interface UserService {

    int addUser(User user);

    User getUser();
}
