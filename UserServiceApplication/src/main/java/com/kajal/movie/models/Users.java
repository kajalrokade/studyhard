package com.kajal.movie.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
public class Users extends BaseModel {

    private String name;
    private String email;
    private String hashedPassword;
    private boolean isVerified;

    @ManyToMany
    private List<Role> roles;


}
