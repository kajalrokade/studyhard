package com.kajal.movie.controllers;

import com.kajal.movie.dtos.UserRequestDTO;
import com.kajal.movie.dtos.UserResponseDTO;
import com.kajal.movie.models.Users;
import com.kajal.movie.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping( value = "/signup" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserResponseDTO> signup(@RequestBody UserRequestDTO userDTO) {
        UserResponseDTO signup = userService.signupUser(userDTO.getName(), userDTO.getEmail(), userDTO.getPassword());
        return ResponseEntity.ok().body(signup);
    }
}
