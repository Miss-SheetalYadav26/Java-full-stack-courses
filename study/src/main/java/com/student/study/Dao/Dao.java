package com.student.study.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.study.Entity.Student;

import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@Repository
public class Dao {

    @Autowired
    private SessionFactory factory;

    // get all students
    public List<Student> getStudent() {
        Session session = factory.openSession();
        CriteriaQuery<Student> cq = session.getCriteriaBuilder().createQuery(Student.class);
        Root<Student> root = cq.from(Student.class);
        cq.select(root);

        List<Student> list = session.createQuery(cq).getResultList();
        session.close();   // ✅ FIX
        return list;
    }

    // get student by id
    public Student getStudentById(int id) {
        Session session = factory.openSession();
        Student student = session.get(Student.class, id);
        session.close();   // ✅ FIX

        if (student == null) {
            throw new RuntimeException("Student not found with id " + id);
        }
        return student;
    }

    // get student by name
    public Student getpatiStudentname(String name) {
        Session session = factory.openSession();

        Student student = session.createQuery(
                "FROM Student s WHERE s.sname = :name", Student.class)
                .setParameter("name", name)
                .uniqueResult();

        session.close();   // ✅ FIX

        if (student == null) {
            throw new RuntimeException("Student not found with name: " + name);
        }
        return student;
    }

    // add student
    public Student addStudent(Student student) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(student);

        tx.commit();
        session.close();

        return student;  
    }
}
