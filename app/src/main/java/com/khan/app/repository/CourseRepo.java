package com.khan.app.repository;

import com.khan.app.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long> {
    @Query(value = "Select * from course where id = :id and enabled=true", nativeQuery = true)
    Course findByIdAndEnabled(Long id);

    @Query(value = "Select * from course where name = :name and enabled=true", nativeQuery = true)
    Course findByNameAndEnabled(String name);

    @Query(value = "Select * from course where enabled=true", nativeQuery = true)
    List<Course> findAllByEnabled();
}
