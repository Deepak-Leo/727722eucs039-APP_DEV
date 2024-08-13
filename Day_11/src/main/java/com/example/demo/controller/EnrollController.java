package com.example.demo.controller;

import com.example.demo.model.Enroll;
import com.example.demo.service.EnrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enrollments")
public class EnrollController {

    @Autowired
    private EnrollService enrollService;

    @PostMapping
    public ResponseEntity<Enroll> createEnrollment(@RequestBody Enroll enroll) {
        Enroll savedEnroll = enrollService.saveEnrollment(enroll);
        return ResponseEntity.ok(savedEnroll);
    }

    @GetMapping
    public ResponseEntity<List<Enroll>> getEnrollmentsByUserId(@RequestParam Long userId) {
        List<Enroll> enrollments = enrollService.getEnrollmentsByUserId(userId);
        return ResponseEntity.ok(enrollments);
    }
}
