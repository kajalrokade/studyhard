package com.kajal.movie.dtos;

import com.kajal.movie.models.Token;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LogoutRequestDTO {
    private String token;
}
