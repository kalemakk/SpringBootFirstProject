package com.sab.student.Controller;

import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.sab.student.Model.Student;
import com.sab.student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentService studentService;
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return studentService.getStudents();
    }
}
