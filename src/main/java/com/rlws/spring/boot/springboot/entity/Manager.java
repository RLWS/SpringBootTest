package com.rlws.spring.boot.springboot.entity;

import javax.persistence.*;

@Table(name = "flora..manager")
public class Manager {
    /**
     * 管理员的唯一标识
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 管理员的邮箱(账号)
     */
    private String email;

    /**
     * 管理员的登录密码
     */
    private String password;

    /**
     * 获取管理员的唯一标识
     *
     * @return id - 管理员的唯一标识
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置管理员的唯一标识
     *
     * @param id 管理员的唯一标识
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取管理员的邮箱(账号)
     *
     * @return email - 管理员的邮箱(账号)
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置管理员的邮箱(账号)
     *
     * @param email 管理员的邮箱(账号)
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取管理员的登录密码
     *
     * @return password - 管理员的登录密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置管理员的登录密码
     *
     * @param password 管理员的登录密码
     */
    public void setPassword(String password) {
        this.password = password;
    }
}