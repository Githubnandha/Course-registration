package com.example.CourseRegistration.Controllers;

import com.example.CourseRegistration.Models.Students;
import com.example.CourseRegistration.Services.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentsController {

    @Autowired
    StudentsService studentsService;

    @GetMapping("/students")
    public List<Students> getStudents() {
        List<Students> obj = studentsService.getAllStudents();
        return obj;
    }


    @PostMapping("/create")
    public String studentsList(@RequestParam  String student_name, @RequestParam  String email, @RequestParam  String course_name) {
        studentsService.saveStudents(student_name, email, course_name);
        return "course registrated";
    }
}
