package com.kajal.movie.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserResponseDTO {
    private String name;
    private String email;
    private Long userId;

    public UserResponseDTO(String name, String email,Long userId) {
        this.name = name;
        this.email = email;
        this.userId = userId;
    }
}
