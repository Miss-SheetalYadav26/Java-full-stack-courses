package com.student.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.student.study.Entity.Student;
import com.student.study.services.Services;

@RestController
@RequestMapping
public class Controller {

    @Autowired
    private Services services;

    // get all students
    @GetMapping("getstudent1")
    public List<Student> getStudent() {
        return services.getStudent();
    }

    // get student by id
    @GetMapping("getstudentById/{id}")
    public Student getStudentById(@PathVariable int id) {
        return services.getStudentById(id);
    }

    // get student by name
    @GetMapping("getpatiStudentname/{name}")
    public Student getpatiStudentname(@PathVariable String name) {
        return services.getpatiStudentname(name);
    }

    // add student
    @PostMapping("add")
    public Student addStudent(@RequestBody Student student) {
        return services.addStudent(student);  
    }
}
