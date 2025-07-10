package com.kajal.movie.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "role",schema = "public")
public class Role extends BaseModel {

    private String name;

}
