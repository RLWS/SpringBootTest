package com.rlws.spring.boot.springboot.entity;

import javax.persistence.*;

@Table(name = "flora..user")
public class User {
    /**
     * 主键(自增长)
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户邮箱(账号)
     */
    private String email;

    private String username;

    /**
     * 用户密码
     */
    private String password;

    private Integer sex;

    private String img;

    /**
     * 用户权限
     */
    private Integer power;

    private Integer frequency;

    /**
     * 获取主键(自增长)
     *
     * @return id - 主键(自增长)
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键(自增长)
     *
     * @param id 主键(自增长)
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户邮箱(账号)
     *
     * @return email - 用户邮箱(账号)
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置用户邮箱(账号)
     *
     * @param email 用户邮箱(账号)
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取用户密码
     *
     * @return password - 用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码
     *
     * @param password 用户密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return sex
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * @return img
     */
    public String getImg() {
        return img;
    }

    /**
     * @param img
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * 获取用户权限
     *
     * @return power - 用户权限
     */
    public Integer getPower() {
        return power;
    }

    /**
     * 设置用户权限
     *
     * @param power 用户权限
     */
    public void setPower(Integer power) {
        this.power = power;
    }

    /**
     * @return frequency
     */
    public Integer getFrequency() {
        return frequency;
    }

    /**
     * @param frequency
     */
    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }
}