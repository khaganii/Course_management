package com.khan.app.repository;

import com.khan.app.domain.Users;
import com.khan.app.dto.UserLoginPermissionResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.Tuple;
import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<Users, Long>{

    @Query(value = "SELECT u.id, u.enabled, a.authority FROM  users as u " +
            "Left JOIN authorities as a on a.username = u.username " +
            " WHERE u.username = :username and u.password = :password and u.enabled = true and a.enabled = true", nativeQuery = true)
    List<Tuple> findByCredentials(String username, String password);

    @Query(value = "Select * from users where enabled = true", nativeQuery = true)
    List<Users> findAllByEnabled();

    @Query(value = "Select * from users where id = :id and enabled = true", nativeQuery = true)
    Users findByIdAndEnabled(Long id);
}
