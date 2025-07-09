package com.kajal.movie.services;

import com.kajal.movie.Repositories.UserRepository;
import com.kajal.movie.dtos.UserResponseDTO;
import com.kajal.movie.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserResponseDTO signupUser(String name,String email, String password) {
        Users user = new Users();
        user.setName(name);
        user.setEmail(email);
        user.setHashedPassword(bCryptPasswordEncoder.encode(password));
        Users userSaved = userRepository.save(user);
        return new UserResponseDTO(userSaved.getName(),userSaved.getEmail());
    }
}
