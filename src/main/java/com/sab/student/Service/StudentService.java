package com.sab.student.Service;

import com.sab.student.Dao.StudentDaoAccess;
import com.sab.student.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class StudentService {
    @Autowired
    @Qualifier("fakedata")
    private StudentDaoAccess studentDaoAccess;
    public Collection<Student> getStudents(){
        return studentDaoAccess.getStudents();
    }

    public Student getStudentById(int id) {
        return this.studentDaoAccess.getStudentById(id);
    }
    public void removeStudentById(int id){
        this.studentDaoAccess.removeStudentById(id);
    }

    public void insertStudent(Student student){
        this.studentDaoAccess.insertStudent(student);
    }
    public void updateStudent(Student student){
       this.studentDaoAccess.updateStudentById(student);
    }
}
