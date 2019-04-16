package com.white.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Competition extends BaseBean {
    private Long id;
    private User user;
    private Integer bonus;
    private String title;
    private Date competitionTime;
    private Date getTime;
    private String imageUrl;
    private Integer level;
    private String organizer;
}
