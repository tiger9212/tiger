package com.outab.tiger.api.modules;

import java.io.Serializable;

/**
 * @Author: 周易(yi.zhou)
 * @Date: 2017/7/16 下午3:59
 * @Description:
 */
public class User implements Serializable{
    private static final long serialVersionUID = 218510296277652484L;
    /**
     * 主键id
     */
    private Long id;
    /**
     * 用户编码
     */
    private Long code;
    /**
     * 用户名称
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 电话
     */
    private String mobile;
    /**
     * 密码
     */
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
