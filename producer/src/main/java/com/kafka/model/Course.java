package com.kafka.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Course {
    private String courseId;
    private String title;
    private String trainer;
    private double price;

}
