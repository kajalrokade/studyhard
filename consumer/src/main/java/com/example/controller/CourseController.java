package com.example.controller;

import com.example.service.CourseService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    CourseService courseService;
    @GetMapping("/get")
    public ResponseEntity<String> getCourse(){
        return  new ResponseEntity<>(courseService.getMessage(), HttpStatus.OK);
    }
}
