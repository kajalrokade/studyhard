package com.kajal.movie.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserResponseDTO {
    private String name;
    private String email;

    public UserResponseDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
