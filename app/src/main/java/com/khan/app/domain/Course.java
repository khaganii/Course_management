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
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String description;
    @OneToOne
    TimeTable timeTable;
    @OneToOne
    User createBy;
    LocalDate timeCreated;
    @ManyToMany(mappedBy = "courses")
    List<Announcement> announcements;
    @OneToMany(mappedBy="course")
    List<Subject> subjects;

}
