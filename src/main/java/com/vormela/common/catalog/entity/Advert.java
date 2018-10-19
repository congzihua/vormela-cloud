package com.vormela.common.catalog.entity;

import java.util.Date;

import lombok.Data;
@Data
public class Advert {
    private Integer id;

    private Integer userId;

    private String name;

    private String netUrl;

    private Date startDate;

    private Date endDate;

    private Date createDate;

    private Date updateDate;

    private Integer positionId;

    private String descInfo;

}