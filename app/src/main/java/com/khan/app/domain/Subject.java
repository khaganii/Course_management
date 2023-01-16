package com.khan.app.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @OneToOne
    User createBy;
    LocalDate timeCreated;
    String description;
    Boolean enabled;
    @OneToOne
    Topic topic;
    @ManyToOne
    @JoinColumn(name="course_id")
    Course course;
}