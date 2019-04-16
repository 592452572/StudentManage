package com.white.entity;

import lombok.Data;

@Data
public class School extends BaseBean{
    private Long id;
    private String name;
    private String address;
}
