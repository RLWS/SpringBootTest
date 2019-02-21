package com.rlws.spring.boot.springboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "flora..reply")
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 回复时间
     */
    @Column(name = "TIME")
    private Date time;

    /**
     * 回复的用户
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 被回复的问题
     */
    @Column(name = "answer_id")
    private Integer answerId;

    /**
     * 回复内容
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
     * 获取回复时间
     *
     * @return TIME - 回复时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置回复时间
     *
     * @param time 回复时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取回复的用户
     *
     * @return user_id - 回复的用户
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置回复的用户
     *
     * @param userId 回复的用户
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取被回复的问题
     *
     * @return answer_id - 被回复的问题
     */
    public Integer getAnswerId() {
        return answerId;
    }

    /**
     * 设置被回复的问题
     *
     * @param answerId 被回复的问题
     */
    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    /**
     * 获取回复内容
     *
     * @return content - 回复内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置回复内容
     *
     * @param content 回复内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}