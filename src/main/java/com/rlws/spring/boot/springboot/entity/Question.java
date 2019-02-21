package com.rlws.spring.boot.springboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "flora..question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 问题标题
     */
    private String title;

    /**
     * 发表时间
     */
    private Date time;

    /**
     * 赞的数量
     */
    private Integer praise;

    /**
     * (外键)category表的主键
     */
    @Column(name = "category_id")
    private Integer categoryId;

    /**
     * (外键)user表的主键
     */
    @Column(name = "user_id")
    private Integer userId;

    private Integer optimal;

    private Integer urgent;

    /**
     * 问题内容
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
     * 获取问题标题
     *
     * @return title - 问题标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置问题标题
     *
     * @param title 问题标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取发表时间
     *
     * @return time - 发表时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置发表时间
     *
     * @param time 发表时间
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
     * 获取(外键)category表的主键
     *
     * @return category_id - (外键)category表的主键
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 设置(外键)category表的主键
     *
     * @param categoryId (外键)category表的主键
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取(外键)user表的主键
     *
     * @return user_id - (外键)user表的主键
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置(外键)user表的主键
     *
     * @param userId (外键)user表的主键
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return optimal
     */
    public Integer getOptimal() {
        return optimal;
    }

    /**
     * @param optimal
     */
    public void setOptimal(Integer optimal) {
        this.optimal = optimal;
    }

    /**
     * @return urgent
     */
    public Integer getUrgent() {
        return urgent;
    }

    /**
     * @param urgent
     */
    public void setUrgent(Integer urgent) {
        this.urgent = urgent;
    }

    /**
     * 获取问题内容
     *
     * @return content - 问题内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置问题内容
     *
     * @param content 问题内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}