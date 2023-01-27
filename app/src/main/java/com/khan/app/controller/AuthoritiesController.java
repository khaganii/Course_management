package com.khan.app.controller;

import com.khan.app.dto.AuthoritiesDto;
import com.khan.app.service.AuthoritiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authorities")
public class AuthoritiesController {
    @Autowired
    AuthoritiesService authoritiesService;

    @GetMapping("/enabled/id/{id}")
    public AuthoritiesDto getByIdAndEnabled(@PathVariable(name = "id") Long id){
        return authoritiesService.findByIdAndEnabled(id);
    }

    @GetMapping("/id/{id}")
    public AuthoritiesDto getById(@PathVariable(name = "id") Long id){
        return authoritiesService.findByIdAndEnabled(id);
    }

}
