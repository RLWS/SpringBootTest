package com.rlws.spring.boot.springboot.entity;

import javax.persistence.*;

@Table(name = "flora..category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 植物类别
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
     * 获取植物类别
     *
     * @return content - 植物类别
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置植物类别
     *
     * @param content 植物类别
     */
    public void setContent(String content) {
        this.content = content;
    }
}