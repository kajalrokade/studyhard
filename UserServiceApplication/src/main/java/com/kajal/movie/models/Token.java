package com.kajal.movie.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "token")
@Data
public class Token extends BaseModel{

    private String value;

    private Date expiryAt;

    @ManyToOne
    private Users user;


}
