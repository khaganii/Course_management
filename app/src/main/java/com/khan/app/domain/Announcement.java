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
public class Announcement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @OneToOne
    Users createBy;
    LocalDate timeCreated;
    LocalDate timeFinished;
    String description;
    Boolean enabled;
    @OneToOne
    Context context;
    @ManyToMany
    @JoinTable(name = "course_announcement",
            joinColumns = @JoinColumn(name = "announcement_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    List<Course> courses;
}
