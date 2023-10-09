package com.example.StudentDetails.Model;

import com.example.StudentDetails.Repository.Repository;
import jakarta.persistence.*;

import java.util.List;

@Table(name = "Details")
@Entity
public class StudentModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ROLL NO")
    private int rollNo;
    @Column(name="NAME")
    private String name;
    @Column(name="GENDER")
    private String gender;
    @Column(name="AGE")
    private int age;
    @Column(name="SPORTS")
    private String sports;

    public StudentModel(int roll_no, String name, String gender, int age, String sports) {
        this.rollNo = roll_no;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.sports = sports;
    }

    public StudentModel() {
        super();
    }


    public int getrollNo() {
        return rollNo;
    }

    public void setrollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSports() {
        return sports;
    }

    public void setSports(String sports) {
        this.sports = sports;
    }

}

