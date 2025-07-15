package com.kajal.movie.dtos;

import com.kajal.movie.models.Role;
import com.kajal.movie.models.Users;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ValidateTokenResponse {
    private String name;
    private String email;
    private boolean isVerified;
    private List<Role> roles;

    public static ValidateTokenResponse fromUser(Users user) {
        if(user == null) return null;
        ValidateTokenResponse response = new ValidateTokenResponse();
        response.setName(user.getName());
        response.setEmail(user.getEmail());
        response.setRoles(user.getRoles());
        response.setVerified(true);
        return response;

    }
}
