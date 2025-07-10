package com.kajal.movie.Repositories;

import com.kajal.movie.dtos.LogoutRequestDTO;
import com.kajal.movie.models.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TokenRepository extends JpaRepository<Token,Integer> {
    Optional<Token> findByValueAndIsDeleted(String value, boolean b);
}
