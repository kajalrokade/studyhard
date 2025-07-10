package com.kajal.movie.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class LoginResponseDTO {
    private String token;
    private String email;
    private Date expiryAt;
}
