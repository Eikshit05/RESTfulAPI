package com.example.StudentDetails.Service;

import com.example.StudentDetails.Repository.Repository;
import com.example.StudentDetails.Model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;


@org.springframework.stereotype.Service
public class Service
{
    //int x;
    @Autowired
    private Repository repository;

    public List<StudentModel> findAllStudents()   //LISTING ALL STUDENTS
    {
        return repository.findAll(Sort.by(Sort.Order.desc("rollNo")));
    }
    public Optional<StudentModel> findByRollNo(int roll_no)      //GETTING STUDENTS BY ROLL NUMBER
    {
        return repository.findById(roll_no);
    }

    public StudentModel saveStudent(StudentModel studentmodel)   // INSET STUDENT DETAIL
    {
        return repository.save(studentmodel);
    }

    public StudentModel updateStudent(StudentModel studentmodel)  //UPDATING STUDENT DETAIL
    {
        return repository.save(studentmodel);
    }


    public void deleteStudent(int roll_no)  //DELETING STUDENT DETAIL
    {
        repository.deleteById(roll_no);
    }


    public List<StudentModel> findByName(String name)
    {
        return repository.findByName(name);
    }

    public List<StudentModel> findByGender(String gender)
    {
        return repository.findByGender(gender);
    }

    public List<StudentModel> findByAge(int age)
    {
        return repository.findByAge(age);
    }

    public List<StudentModel> findBySports(String sports)
    {
        return repository.findBySports(sports);
    }
}
