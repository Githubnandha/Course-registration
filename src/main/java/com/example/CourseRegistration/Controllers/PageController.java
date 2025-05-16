package com.example.CourseRegistration.Controllers;

import com.example.CourseRegistration.Models.Course;
import com.example.CourseRegistration.Models.Students;
import com.example.CourseRegistration.Services.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PageController {
    @Autowired
    StudentsService studentsService;
    @GetMapping("/")
    public String page() {
        return "index";
    }
    @GetMapping("/application")
    public String application(Model model) {
        List<String> courses = studentsService.getStudentCourses();
        model.addAttribute("courses", courses);
        return "application";
    }
    @GetMapping("/enroll")
    public String enroll(Model model) {
        List<Students> students = studentsService.getAllStudents();
        model.addAttribute("students",students);
        return "enroll";
    }

    @Autowired
    CourseController courseController;
    @GetMapping("/courses")
    public String courses(Model model) {
        List<Course> course = courseController.getAllCourse();
        for(Course i: course) {
            System.out.println(i);
        }
        model.addAttribute("courses",course);
        return "Courses";
    }
}
