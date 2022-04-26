package com.nology;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface CourseRepository extends JpaRepository<Course,String> {
    Course findById(int id);
    String deleteById(int id);
}
