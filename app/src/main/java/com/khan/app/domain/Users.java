package com.khan.app.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String surname;
    String username;
    String password;
    String email;
    LocalDate timeCreated;
    LocalDate birthday;
    String description;
    Boolean enabled;
    @ManyToOne
    @JoinColumn(name="group_id")
            @JsonIgnore
    Group group;
}
