package com.example.StudentDetails.Controller;


import com.example.StudentDetails.Service.Service;
import com.example.StudentDetails.Model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class Controller
{
    private StudentModel studentmodel;
    public void setStudentmodel(StudentModel studentmodel) {
        this.studentmodel = studentmodel;
    }

    @Autowired
    private Service service;

    @GetMapping("/getAll")
    public List<StudentModel> list()
    {
        return service.findAllStudents();
    }
    @GetMapping("/{rollNo}")
    public Optional<StudentModel> findByRollNo(@PathVariable("rollNo") int rollNo)
    {
        return service.findByRollNo(rollNo);
    }

    @PostMapping("/add")
    public StudentModel saveStudent(@RequestBody StudentModel studentmodel)
    {
        return service.saveStudent(studentmodel);
    }

    @PutMapping("/update/{rollNo}")
    public StudentModel updateStudent(@RequestBody StudentModel studentmodel,@PathVariable("rollNo") int rollNo)
    {
        studentmodel.setrollNo(rollNo);
        return service.updateStudent(studentmodel);
    }

    @DeleteMapping("/{rollNo}")
    public void deleteStudent(@PathVariable("rollNo") int rollNo)
    {
        service.deleteStudent(rollNo);

//        System.out.println("STUDENT WITH ROLL NUMBER : "+rollNo+" DELETED");
    }

    @GetMapping("/Name/{name}")
    public List<StudentModel> getByName(@PathVariable String name)
    {
        return service.findByName(name);
    }

    @GetMapping("/Gender/{gender}")
    public List<StudentModel> getByGender(@PathVariable String gender)
    {
        return service.findByGender(gender);
    }

    @GetMapping("/Age/{age}")
    public List<StudentModel> getByAge(@PathVariable("age") int age)
    {
        return service.findByAge(age);
    }

    @GetMapping("/Sports/{sports}")
    public List<StudentModel> getBySports(@PathVariable String sports)
    {
        return service.findBySports(sports);
    }
}
