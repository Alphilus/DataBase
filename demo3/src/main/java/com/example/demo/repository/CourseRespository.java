package com.example.demo.repository;

import com.example.demo.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CourseRespository extends JpaRepository<Course, Integer> {
    @Query(value = "select * from Course where price=? and time_line=? and vote>?", nativeQuery = true)
    Course findCourseByMonthAndPriceAndVote(double price, String timeLine, int vote);
}
