package com.khan.app.service;

import com.khan.app.domain.Authority;
import com.khan.app.dto.AuthoritiesDto;
import com.khan.app.repository.AuthorityRepo;
import com.khan.app.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthoritiesService {

    @Autowired
    AuthorityRepo authorityRepo;

    public AuthoritiesDto findByIdAndEnabled(Long id) {
        Authority a = authorityRepo.findByIdAndEnabled(id);
        return a == null ? Mapper.map(a, AuthoritiesDto.class): null;
    }
}
