package com.khan.app.dto;

import com.khan.app.domain.Users;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CourseCreationRequestDto {
    String name;
    String description;
    Users createBy;
    LocalDate timeCreated;
    Boolean enabled;
}