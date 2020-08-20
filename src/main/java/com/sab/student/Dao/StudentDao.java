package com.sab.student.Dao;

import com.sab.student.Model.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
@Qualifier("fakedata")
public class StudentDao implements StudentDaoAccess {
    private static Map<Integer, Student> students;
    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1,new Student(1,"arnold","Bsse"));
                put(2,new Student(2,"kalema","Cs"));
                put(3,new Student(3,"suna","IT"));
            }
        };
    }
    @Override
    public Collection<Student> getStudents(){
        return this.students.values();
    }

    @Override
    public Student getStudentById(int id) {
        return this.students.get(id);

    }
    @Override
    public void removeStudentById(int id){
        this.students.remove(id);
    }
    @Override
    public void insertStudent(Student student){
        students.put(student.getId(),student);
    }
    @Override
    public void updateStudentById(Student student){
        Student previousStudentObj = students.get(student.getId());
        previousStudentObj.setCourse(student.getCourse());
        previousStudentObj.setName(student.getName());
        students.put(student.getId(),student);
    }
}
