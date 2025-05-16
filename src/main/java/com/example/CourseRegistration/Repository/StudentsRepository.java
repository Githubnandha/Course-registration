package com.example.CourseRegistration.Repository;

import com.example.CourseRegistration.Models.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students,Integer> {

}
