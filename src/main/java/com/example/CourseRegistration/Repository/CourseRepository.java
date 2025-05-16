package com.example.CourseRegistration.Repository;

import com.example.CourseRegistration.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseRepository extends  JpaRepository<Course,Long> {
    @Query(value= "SELECT course_name FROM course", nativeQuery = true)
    List<String> getCourses();
}
