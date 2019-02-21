package com.rlws.spring.boot.springboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "flora..message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 发送信息时间
     */
    private Date time;

    /**
     * 接收信息的用户
     */
    @Column(name = "user_id_j")
    private Integer userIdJ;

    /**
     * 发送信息的用户
     */
    @Column(name = "user_id_f")
    private Integer userIdF;

    /**
     * 是否处理
     */
    private Integer handle;

    /**
     * 信息内容
     */
    private String content;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取发送信息时间
     *
     * @return time - 发送信息时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置发送信息时间
     *
     * @param time 发送信息时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取接收信息的用户
     *
     * @return user_id_j - 接收信息的用户
     */
    public Integer getUserIdJ() {
        return userIdJ;
    }

    /**
     * 设置接收信息的用户
     *
     * @param userIdJ 接收信息的用户
     */
    public void setUserIdJ(Integer userIdJ) {
        this.userIdJ = userIdJ;
    }

    /**
     * 获取发送信息的用户
     *
     * @return user_id_f - 发送信息的用户
     */
    public Integer getUserIdF() {
        return userIdF;
    }

    /**
     * 设置发送信息的用户
     *
     * @param userIdF 发送信息的用户
     */
    public void setUserIdF(Integer userIdF) {
        this.userIdF = userIdF;
    }

    /**
     * 获取是否处理
     *
     * @return handle - 是否处理
     */
    public Integer getHandle() {
        return handle;
    }

    /**
     * 设置是否处理
     *
     * @param handle 是否处理
     */
    public void setHandle(Integer handle) {
        this.handle = handle;
    }

    /**
     * 获取信息内容
     *
     * @return content - 信息内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置信息内容
     *
     * @param content 信息内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}