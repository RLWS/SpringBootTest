package com.rlws.spring.boot.springboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "flora..apply")
public class Apply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 申请时间
     */
    private Date time;

    /**
     * 是否已处理
     */
    private Integer handle;

    /**
     * 申请人ID
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 申请理由
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
     * 获取申请时间
     *
     * @return time - 申请时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置申请时间
     *
     * @param time 申请时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取是否已处理
     *
     * @return handle - 是否已处理
     */
    public Integer getHandle() {
        return handle;
    }

    /**
     * 设置是否已处理
     *
     * @param handle 是否已处理
     */
    public void setHandle(Integer handle) {
        this.handle = handle;
    }

    /**
     * 获取申请人ID
     *
     * @return user_id - 申请人ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置申请人ID
     *
     * @param userId 申请人ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取申请理由
     *
     * @return content - 申请理由
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置申请理由
     *
     * @param content 申请理由
     */
    public void setContent(String content) {
        this.content = content;
    }
}