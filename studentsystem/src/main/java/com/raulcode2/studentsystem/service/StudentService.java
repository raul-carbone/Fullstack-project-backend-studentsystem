package com.raulcode2.studentsystem.service;

import com.raulcode2.studentsystem.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent (Student student);

    public List<Student> getAllStudents();




}
