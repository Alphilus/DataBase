package com.example.demo.services;

import com.example.demo.entities.Course;
import com.example.demo.repository.CourseRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    private CourseRespository courseRespository;
    public void findCourseByMonthAndPriceAndVote(double price, String timeLine, int vote){
        Course course = courseRespository.findCourseByMonthAndPriceAndVote(price, timeLine, vote);
        if (course!=null)
            System.out.println(course);
        else System.out.println("Không tìm thấy khóa học");
    }
}
