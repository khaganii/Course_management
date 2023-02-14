package com.khan.app.dto;

import com.khan.app.domain.Announcement;
import com.khan.app.domain.Subject;
import com.khan.app.domain.TimeTable;
import com.khan.app.domain.Users;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CourseAllDto {
    String name;
    String description;
    TimeTable timeTable;
    Users createBy;
    LocalDate timeCreated;
    List<Announcement> announcements;
    List<Subject> subjects;
    Boolean enabled;
}
