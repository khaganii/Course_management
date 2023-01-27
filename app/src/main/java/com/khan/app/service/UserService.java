package com.khan.app.service;

import com.khan.app.dto.UserLoginPermissionResponseDto;
import com.khan.app.dto.UserRequestLoginDto;
import com.khan.app.dto.UserResponseLoginDto;
import com.khan.app.repository.UserRepo;
import com.khan.app.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Tuple;
import java.math.BigInteger;
import java.util.List;

@Service

public class UserService {
    @Autowired
    UserRepo userRepo;

    public UserResponseLoginDto findById(Long id) {
        return Mapper.map(userRepo.findById(id).get(), UserResponseLoginDto.class);
    }

    public UserLoginPermissionResponseDto findByUsername(UserRequestLoginDto userRequestLoginDto) {
        List<Tuple> data= userRepo.findByCredentials(userRequestLoginDto.getUsername(), "{noop}".concat(userRequestLoginDto.getPassword()));
        List<UserLoginPermissionResponseDto> myDto = data.stream()
                .map(t -> new UserLoginPermissionResponseDto(
                        t.get(0, BigInteger.class),
                        t.get(1, Boolean.class),
                        t.get(2, String.class)
                )).toList();

        return myDto.get(0);
    }

    public List<UserResponseLoginDto> findAll() {
        return Mapper.mapAll(userRepo.findAll(), UserResponseLoginDto.class);
    }

    public List<UserResponseLoginDto> findAllByEnabled() {
        return Mapper.mapAll(userRepo.findAllByEnabled(), UserResponseLoginDto.class);
    }

    public UserResponseLoginDto findByIdEnabled(Long id) {
        return  Mapper.map(userRepo.findByIdAndEnabled(id), UserResponseLoginDto.class);
    }
}
