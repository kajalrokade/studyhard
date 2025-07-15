package com.kajal.movie.controllers;

import com.kajal.movie.dtos.*;
import com.kajal.movie.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/signup", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserResponseDTO> signup(@RequestBody UserRequestDTO userDTO) {
        UserResponseDTO signup = userService.signupUser(userDTO.getName(), userDTO.getEmail(), userDTO.getPassword());
        return ResponseEntity.ok().body(signup);
    }

    @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginDTO loginDTO) {
        LoginResponseDTO token = userService.loginUser(loginDTO.getEmail(), loginDTO.getPassword());
        return ResponseEntity.ok().body(token);
    }

    @PostMapping(value = "/logout", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> logout(@RequestBody LogoutRequestDTO token) {
        userService.logoutUser(token);
        return ResponseEntity.ok().body("Logged out successfully");
    }

    @PostMapping(value ="/validateToken")
    public ResponseEntity<ValidateTokenResponse> validateToken(@RequestParam("token") String token) {
           return ResponseEntity.ok().body(ValidateTokenResponse.fromUser(userService.validateToken(token)));
    }
}
