package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name = "time_line")
    private String timeLine;
    private String description;
    private double price;
    @Column(name = "type_course")
    private String typeCourse;
    private int vote;
}
