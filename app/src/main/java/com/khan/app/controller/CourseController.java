package com.khan.app.controller;

import com.khan.app.dto.CourseAllDto;
import com.khan.app.dto.UserLoginPermissionResponseDto;
import com.khan.app.dto.UserRequestLoginDto;
import com.khan.app.dto.UserResponseLoginDto;
import com.khan.app.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("/enabled/id/{id}")
    public CourseAllDto getByIdAndEnabled(@PathVariable("id") Long id){
        return courseService.findByIdEnabled(id);
    }

    @GetMapping("/id/{id}")
    public CourseAllDto getById(@PathVariable("id") Long id){
        return courseService.findById(id);
    }

    @GetMapping("/name/{name}")
    public CourseAllDto getByNameAndEnabled(@PathVariable("name") String name){
        return courseService.findByNameAndEnabled(name);
    }

    @GetMapping("/all")
    @PreAuthorize(value = "hasAuthority('admin')")
    public List<CourseAllDto> getAll(){
        return courseService.findAll();
    }

    @GetMapping("/all-enabled")
    @PreAuthorize(value = "hasAuthority('admin')")
    public List<CourseAllDto> getAllEnabled(){
        return courseService.findAllByEnabled();
    }


}
