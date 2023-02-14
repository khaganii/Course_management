package com.khan.app.service;

import com.khan.app.domain.Course;
import com.khan.app.dto.CourseAllDto;
import com.khan.app.repository.CourseRepo;
import com.khan.app.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;

    public CourseAllDto findByIdEnabled(Long id) {
        Course c = courseRepo.findByIdAndEnabled(id);
        return c!=null ? Mapper.map(c, CourseAllDto.class):null;
    }

    public CourseAllDto findById(Long id) {
        Course c = courseRepo.findById(id).get();
        return c != null ? Mapper.map(c, CourseAllDto.class):null;

    }

    public CourseAllDto findByNameAndEnabled(String name) {
        Course c = courseRepo.findByNameAndEnabled(name);
        return c!=null ? Mapper.map(c, CourseAllDto.class):null;
    }

    public List<CourseAllDto> findAllByEnabled() {
        return Mapper.mapAll(courseRepo.findAllByEnabled(), CourseAllDto.class);
    }

    public List<CourseAllDto> findAll() {
        return Mapper.mapAll(courseRepo.findAll(), CourseAllDto.class);
    }
}
