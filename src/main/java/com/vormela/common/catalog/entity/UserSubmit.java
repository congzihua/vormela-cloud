package com.vormela.common.catalog.entity;

import java.util.Date;

import lombok.Data;
@Data
public class UserSubmit {
    private Integer id;

    private String title;

    private String content;

    private Date createDate;

    private Date updateDate;

    private Integer userId;

   
}