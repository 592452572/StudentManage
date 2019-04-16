package com.white.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User extends BaseBean {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "role")
    private Byte role; // 学生，老师

    @Column(name = "user_name")
    private String userName;

    @Column(name = "sex")
    private Byte sex; //0-女， 1-男

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "school")
    private School school;

    @Column(name = "institute")
    private String institute;//学院

    @Column(name = "professional")
    private String professional; //专业

    @Column(name = "id_cart")
    private String idCart;

    @Column(name = "phone")
    private String phone;
}
