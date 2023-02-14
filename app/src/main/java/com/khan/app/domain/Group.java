package com.khan.app.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "groupsOfUsers")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(unique = true)
    String name;
    @OneToOne
    @JsonIgnore
    Users createBy;
    LocalDate timeCreated;
    String description;
    Boolean enabled;
    @OneToMany(mappedBy="group")
            @JsonIgnore
    List<Users> users;
}
