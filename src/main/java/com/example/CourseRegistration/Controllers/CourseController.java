package com.example.CourseRegistration.Controllers;

import com.example.CourseRegistration.Models.Course;
import com.example.CourseRegistration.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    public List<Course> getAllCourse() {
        List<Course> obj =  courseRepository.findAll();
        return  obj;
    }
}
