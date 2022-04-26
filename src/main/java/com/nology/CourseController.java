package com.nology;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CourseController {

    @Autowired
    CourseRepository repository;

    private final List<Course> courses = new ArrayList<>();


    @PostMapping("/course")
    public ResponseEntity<String> createCourse(@RequestBody Course course) {
        repository.save(course);
        return ResponseEntity.status(HttpStatus.CREATED).body("Success, greeting has been added");
    }

    @GetMapping("/course/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findById(Integer.parseInt(id)));
    }

    @DeleteMapping("/course/{id}")
    @Transactional
    public ResponseEntity<String> deleteCourse(@PathVariable String id) {
        repository.deleteById(Integer.parseInt(id));
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Success, greeting has been deleted");
    }

    @GetMapping("/courses")
    public ResponseEntity<List<Course>> getCourse() {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll()); // RETURNS EVERYTHING
    }

}


