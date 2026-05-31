package com.kafka.controller;

import com.kafka.model.Course;
import com.kafka.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/publish")
    public ResponseEntity<String> sendCourse(@RequestBody Course course) {
        String result = courseService.sendCourse(course);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
