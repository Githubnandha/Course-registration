package com.example.CourseRegistration.Services;

import com.example.CourseRegistration.Models.Students;
import com.example.CourseRegistration.Repository.CourseRepository;
import com.example.CourseRegistration.Repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {
    @Autowired
    StudentsRepository studentsRepository;
    @Autowired
    CourseRepository courseRepository;

    public List<Students> getAllStudents() {
        return studentsRepository.findAll();
    }

    public List<String> getStudentCourses() {
         List<String> obj = courseRepository.getCourses();
         return obj;
    }

    public void saveStudents(String student_name,String email,String course_name) {
        Students student = new Students();
        student.setStudent_name(student_name);
        student.setEmail(email);
        student.setCourse_name(course_name);
        studentsRepository.save(student);
    }
}
