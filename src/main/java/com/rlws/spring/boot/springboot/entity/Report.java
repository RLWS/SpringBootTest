package com.rlws.spring.boot.springboot.entity;

import javax.persistence.*;

@Table(name = "flora..report")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 举报的用户
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 被举报的问题
     */
    @Column(name = "question_id")
    private Integer questionId;

    /**
     * 被举报的回答
     */
    @Column(name = "answer_id")
    private Integer answerId;

    /**
     * 举报备注
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
     * 获取举报的用户
     *
     * @return user_id - 举报的用户
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置举报的用户
     *
     * @param userId 举报的用户
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取被举报的问题
     *
     * @return question_id - 被举报的问题
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * 设置被举报的问题
     *
     * @param questionId 被举报的问题
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    /**
     * 获取被举报的回答
     *
     * @return answer_id - 被举报的回答
     */
    public Integer getAnswerId() {
        return answerId;
    }

    /**
     * 设置被举报的回答
     *
     * @param answerId 被举报的回答
     */
    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    /**
     * 获取举报备注
     *
     * @return content - 举报备注
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置举报备注
     *
     * @param content 举报备注
     */
    public void setContent(String content) {
        this.content = content;
    }
}