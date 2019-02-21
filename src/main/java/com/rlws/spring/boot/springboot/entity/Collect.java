package com.rlws.spring.boot.springboot.entity;

import javax.persistence.*;

@Table(name = "flora..collect")
public class Collect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 点赞的用户
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 被点赞的问题
     */
    @Column(name = "question_id")
    private Integer questionId;

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
     * 获取被点赞的问题
     *
     * @return question_id - 被点赞的问题
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * 设置被点赞的问题
     *
     * @param questionId 被点赞的问题
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }
}