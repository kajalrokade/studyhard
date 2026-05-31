package com.kafka.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Course {
    private String courseId;
    private String title;
    private String trainer;
    private double price;

}
