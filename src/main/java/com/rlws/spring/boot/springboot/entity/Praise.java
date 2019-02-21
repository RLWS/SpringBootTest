package com.rlws.spring.boot.springboot.entity;

import javax.persistence.*;

@Table(name = "flora..praise")
public class Praise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 点赞的用户
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 被点赞的答案
     */
    @Column(name = "answer_id")
    private Integer answerId;

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
     * 获取点赞的用户
     *
     * @return user_id - 点赞的用户
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置点赞的用户
     *
     * @param userId 点赞的用户
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取被点赞的答案
     *
     * @return answer_id - 被点赞的答案
     */
    public Integer getAnswerId() {
        return answerId;
    }

    /**
     * 设置被点赞的答案
     *
     * @param answerId 被点赞的答案
     */
    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }
}