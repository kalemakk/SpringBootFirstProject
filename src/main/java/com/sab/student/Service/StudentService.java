package com.sab.student.Service;

import com.sab.student.Dao.StudentDao;
import com.sab.student.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class StudentService {
    @Autowired
    StudentDao studentDao;
    public Collection<Student> getStudents(){
        return studentDao.getStudents();
    }
}
