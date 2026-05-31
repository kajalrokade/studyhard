package com.example.service;

import com.example.model.Course;
import lombok.Getter;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Getter
    private String message;

    @KafkaListener(topics = "producertopic", groupId = "producertopic-group")
    public void listen(Course course) {
        message = course + " Got the data from kafka";
        System.out.println(message);
    }

}
