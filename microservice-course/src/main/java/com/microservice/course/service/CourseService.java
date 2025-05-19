package com.microservice.course.service;

import com.microservice.course.http.response.StudentByCourseResponse;
import com.microservice.course.model.Course;

import java.util.List;

public interface CourseService {

    List<Course> findAll();
    Course findById(Long id);
    void save(Course course);
    StudentByCourseResponse findStudentsByIdCourse(Long idCourse);

}
