package com.souche.entity;

/**
 * Created by liuqizhe on 15/9/28.
 */
public class User {
    private String username ;
    private String password ;
    private String pri ;
    //扩展属性，用于添加验证码
    private String code ;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPri() {
        return pri;
    }

    public void setPri(String pri) {
        this.pri = pri;
    }
}
