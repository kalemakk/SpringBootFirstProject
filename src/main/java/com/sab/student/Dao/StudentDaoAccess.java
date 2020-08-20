package com.sab.student.Dao;

import com.sab.student.Model.Student;

import java.util.Collection;

public interface StudentDaoAccess {
    Collection<Student> getStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void insertStudent(Student student);

    void updateStudentById(Student student);
}
