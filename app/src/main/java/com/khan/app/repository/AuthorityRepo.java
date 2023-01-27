package com.khan.app.repository;

import com.khan.app.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepo extends JpaRepository<Authority, Long> {

    @Query(value = "Select * from authorities where id = :id and enabled = true", nativeQuery = true)
    Authority findByIdAndEnabled(Long id);
}
