package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class TransactionHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "registration_date")
    private String registrationDate;
    private String status;
}
