package com.white.entity;

import lombok.Data;

import java.util.Date;

@Data
public class BaseBean {
    
    private Date CTime;
    private Date UTime;
    private Date CUser;
    private Date UUser;
    private boolean isDelete;
}
