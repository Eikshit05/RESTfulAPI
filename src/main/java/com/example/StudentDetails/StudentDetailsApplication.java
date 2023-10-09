package com.example.StudentDetails;

import com.example.StudentDetails.Model.StudentModel;
import com.example.StudentDetails.Repository.Repository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class StudentDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentDetailsApplication.class, args);

		//List<StudentModel> getStudentModelByName= Repository.getStudentModelByName("Eikshit");
	}

}
