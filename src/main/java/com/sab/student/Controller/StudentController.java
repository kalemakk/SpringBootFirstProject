package com.sab.student.Controller;

import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.sab.student.Model.Student;
import com.sab.student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping
    public Collection<Student> getAllStudents(){
        return studentService.getStudents();
    }
    @GetMapping(value = "/{id}")
    public Student getStudentById(@PathVariable("id") int id) {
        return this.studentService.getStudentById(id);
    }
    @DeleteMapping("/{id}")
    public void removeStudent(@PathVariable("id") int id){
        this.studentService.removeStudentById(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudent(@RequestBody Student student){
        this.studentService.insertStudent(student);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudent(@RequestBody Student student){
        this.studentService.updateStudent(student);
    }


}
