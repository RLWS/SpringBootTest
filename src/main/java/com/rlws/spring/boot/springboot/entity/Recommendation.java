package com.rlws.spring.boot.springboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "flora..recommendation")
public class Recommendation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 推荐标题
     */
    private String title;

    /**
     * 发布时间
     */
    private Date time;

    /**
     * 发布用户
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 详细内容
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
     * 获取推荐标题
     *
     * @return title - 推荐标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置推荐标题
     *
     * @param title 推荐标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取发布时间
     *
     * @return time - 发布时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置发布时间
     *
     * @param time 发布时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取发布用户
     *
     * @return user_id - 发布用户
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置发布用户
     *
     * @param userId 发布用户
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取详细内容
     *
     * @return content - 详细内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置详细内容
     *
     * @param content 详细内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}