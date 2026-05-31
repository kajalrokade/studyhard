package com.kafka.service;

import com.kafka.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class CourseService {

    @Autowired
    private KafkaTemplate<String, Course> kafkaTemplate;

    public String sendCourse(Course course) {
        kafkaTemplate.send("producertopic", "course", course);
        return "Course Messgae sent";
    }

}
