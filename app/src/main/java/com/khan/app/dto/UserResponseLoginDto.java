package com.khan.app.dto;

import com.khan.app.domain.Group;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponseLoginDto {
    String name;
    String surname;
    String username;
    String password;
    String email;
    LocalDate timeCreated;
    LocalDate birthday;
    String description;
    Boolean enabled;
    Group group;
}
