package com.khan.app.controller;

import com.khan.app.dto.UserLoginPermissionResponseDto;
import com.khan.app.dto.UserRequestLoginDto;
import com.khan.app.dto.UserResponseLoginDto;
import com.khan.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/enabled/id/{id}")
    public UserResponseLoginDto getByIdAndEnabled(@PathVariable("id") Long id){
        return userService.findByIdEnabled(id);
    }

    @GetMapping("/id/{id}")
    public UserResponseLoginDto getById(@PathVariable("id") Long id){
        return userService.findById(id);
    }

    @GetMapping("/username")
    public UserLoginPermissionResponseDto getByUsername(@RequestBody UserRequestLoginDto userRequestLoginDto){
        return userService.findByUsername(userRequestLoginDto);
    }

    @GetMapping("/all")
    @PreAuthorize(value = "hasAuthority('admin')")
    public List<UserResponseLoginDto> getAll(){
        return userService.findAll();
    }

    @GetMapping("/all-enabled")
    @PreAuthorize(value = "hasAuthority('admin')")
    public List<UserResponseLoginDto> getAllEnabled(){
        return userService.findAllByEnabled();
    }


}
