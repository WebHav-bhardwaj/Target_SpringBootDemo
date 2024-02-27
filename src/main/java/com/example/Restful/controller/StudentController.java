package com.example.Restful.controller;

import com.example.Restful.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;



    @RequestMapping("/students")
    public List<Student> getStudents() {

        return studentService.getStudents();
    }

    @RequestMapping(method = RequestMethod.POST, value ="students")
    public void addStudent(@RequestBody Student student) {
        System.out.println("controllers add student");
        studentService.addStudent(student);
    }

    @RequestMapping("/students/{id}")
    public Student findStudent(@PathVariable int id){//in url path there's a variable

        return studentService.findStudent(id);

    }
}

