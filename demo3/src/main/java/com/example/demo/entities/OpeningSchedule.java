package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class OpeningSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Start_Date")
    private String startDate;
    private String address;
    @Column(name = "Study_Day")
    private String studyDay;
    @Column(name = "Study_Time")
    private String studyTime;
}
