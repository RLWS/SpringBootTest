package com.rlws.spring.boot.springboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "flora..answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 回答时间
     */
    private Date time;

    /**
     * 赞的数量
     */
    private Integer praise;

    /**
     * 回答的用户
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 被回答的问题
     */
    @Column(name = "question_id")
    private Integer questionId;

    /**
     * 回答内容
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
     * 获取回答时间
     *
     * @return time - 回答时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置回答时间
     *
     * @param time 回答时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取赞的数量
     *
     * @return praise - 赞的数量
     */
    public Integer getPraise() {
        return praise;
    }

    /**
     * 设置赞的数量
     *
     * @param praise 赞的数量
     */
    public void setPraise(Integer praise) {
        this.praise = praise;
    }

    /**
     * 获取回答的用户
     *
     * @return user_id - 回答的用户
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置回答的用户
     *
     * @param userId 回答的用户
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取被回答的问题
     *
     * @return question_id - 被回答的问题
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * 设置被回答的问题
     *
     * @param questionId 被回答的问题
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    /**
     * 获取回答内容
     *
     * @return content - 回答内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置回答内容
     *
     * @param content 回答内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}