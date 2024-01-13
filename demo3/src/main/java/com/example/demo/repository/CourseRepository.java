package com.example.demo.repository;

import com.example.demo.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    @Query(value = "select * from Course where price=? and time_line=? and vote>?", nativeQuery = true)
    List<Course> findCourseByMonthAndPriceAndVote(double price, String timeLine, int vote);

    @Modifying
    @Transactional
    @Query(value = "insert into Course(name, timeLine) value(?)", nativeQuery = true)
    void insertCourse(String name, String timeLine);
}
