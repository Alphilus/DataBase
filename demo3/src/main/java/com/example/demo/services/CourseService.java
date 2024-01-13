package com.example.demo.services;

import com.example.demo.entities.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    public void findCourseByMonthAndPriceAndVote(double price, String timeLine, int vote){
        List<Course> course = courseRepository.findCourseByMonthAndPriceAndVote(price, timeLine, vote);
        if (course!=null)
            System.out.println(course);
        else System.out.println("Không tìm thấy khóa học");
    }

    public void insertCourse(String name, String timeLine){
        courseRepository.insertCourse(name,timeLine);
    }
}
