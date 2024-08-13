package com.example.demo.repository;

import com.example.demo.model.Enroll;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EnrollRepository extends JpaRepository<Enroll, Long> {
    List<Enroll> findByUserId(Long userId);
}
