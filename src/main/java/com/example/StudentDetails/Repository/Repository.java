package com.example.StudentDetails.Repository;

import com.example.StudentDetails.Model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<StudentModel,Integer>
{
    //@Query(value = "Select * FROM Details  where name=:a",nativeQuery = true)
    @Query(value = "select a from StudentModel a where a.name = :name order by a.rollNo")
    //public List<StudentModel> findByName(@Param("a") String name);
     List<StudentModel> findByName(@Param("name") String name);

    @Query(value = "select a from StudentModel a where a.gender =:gender")
    public List<StudentModel> findByGender(String gender);

    @Query(value = "select a from StudentModel a where a.age = :a")
    public List<StudentModel> findByAge(@Param("a") int age);

    @Query(value = "select a from StudentModel a where a.sports=:a")
    public List<StudentModel> findBySports(@Param("a") String sports);

    //@Query(value="select a from StudentModel a where a.")

}
