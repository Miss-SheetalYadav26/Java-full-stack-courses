package com.student.study.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.study.Dao.Dao;
import com.student.study.Entity.Student;

@Service
public class Services {

    @Autowired
    private Dao dao;

    // get all students
    public List<Student> getStudent() {
        return dao.getStudent();
    }

    // get student by id
    public Student getStudentById(int id) {
        return dao.getStudentById(id);
    }

    // get student by name
    public Student getpatiStudentname(String name) {
        return dao.getpatiStudentname(name);
    }

    // add student (POST)
    public Student addStudent(Student student) {
        return dao.addStudent(student);   
    }
}
