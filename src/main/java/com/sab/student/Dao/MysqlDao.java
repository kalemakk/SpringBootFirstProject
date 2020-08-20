package com.sab.student.Dao;

import com.sab.student.Model.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
@Repository
@Qualifier("MySQLData")
public class MysqlDao implements StudentDaoAccess {

    @Override
    public Collection<Student> getStudents() {
        return new ArrayList<Student>(){
            {
                add(new Student(9,"Matha","physics"));
            }
        };
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void insertStudent(Student student) {

    }

    @Override
    public void updateStudentById(Student student) {

    }
}
