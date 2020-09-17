package com.buck.apache.dubbo.provider.pojo;



/**
 * @program: hello-apache-dubbo
 * @description:
 * @author: buck
 * @create: 2020-07-17 15:54
 **/
public class User {
    private String name;
    private int age;
    private String address;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
