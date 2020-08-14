package com.sab.student.Dao;

import com.sab.student.Model.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class StudentDao {
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
    public Collection<Student> getStudents(){
        return this.students.values();
    }

}
