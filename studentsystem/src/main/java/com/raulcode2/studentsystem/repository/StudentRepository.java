package com.raulcode2.studentsystem.repository;

import com.raulcode2.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
