package com.example.demo.entities;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String phone;
    private String email;
    @Column(name = "role_id")
    private Integer roleId;
}
