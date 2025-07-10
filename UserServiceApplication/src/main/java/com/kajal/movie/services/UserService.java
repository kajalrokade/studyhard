package com.kajal.movie.services;

import com.kajal.movie.Repositories.TokenRepository;
import com.kajal.movie.Repositories.UserRepository;
import com.kajal.movie.dtos.LoginResponseDTO;
import com.kajal.movie.dtos.LogoutRequestDTO;
import com.kajal.movie.dtos.UserResponseDTO;
import com.kajal.movie.models.Token;
import com.kajal.movie.models.Users;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TokenRepository tokenRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserResponseDTO signupUser(String name,String email, String password) {
        Users user = new Users();
        user.setName(name);
        user.setEmail(email);
        user.setHashedPassword(bCryptPasswordEncoder.encode(password));
        Users userSaved = userRepository.save(user);
        return new UserResponseDTO(userSaved.getName(),userSaved.getEmail(),userSaved.getId());
    }

    public LoginResponseDTO loginUser(String email, String password) {
        Optional<Users> user= userRepository.findByEmail(email);
        if(user.isEmpty()) {
            throw new RuntimeException("User not found");
        }
        if(!bCryptPasswordEncoder.matches(password,user.get().getHashedPassword())) {
            // password is invalid
            throw new RuntimeException("Wrong password");
        }
        Date expiryDate = Date.from(LocalDate.now().plusDays(30).atStartOfDay(ZoneId.systemDefault()).toInstant());
        Token token = new Token();
        token.setUser(user.get());
        token.setExpiryAt(expiryDate);
        token.setValue(RandomStringUtils.random(128));
        token= tokenRepository.save(token);
        LoginResponseDTO loginResponseDTO = new LoginResponseDTO();
        loginResponseDTO.setToken(token.getValue());
        loginResponseDTO.setExpiryAt(expiryDate);
        loginResponseDTO.setEmail(email);
        return loginResponseDTO;
    }

    public void  logoutUser(LogoutRequestDTO value){
        Optional<Token> deletedToken =  tokenRepository.findByValueAndIsDeleted(value.getToken(),false);
        if(deletedToken.isEmpty())
            throw new RuntimeException("Token not found");
        Token token = deletedToken.get();
        token.setDeleted(true);
        tokenRepository.save(token);
    }
}
