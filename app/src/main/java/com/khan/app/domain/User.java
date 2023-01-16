package com.khan.app.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String surname;
    String username;
    String password;
    LocalDate timeCreated;
    LocalDate birthday;
    String description;
    Boolean enabled;
    @ManyToOne
    @JoinColumn(name="group_id")
    private Group group;
}
