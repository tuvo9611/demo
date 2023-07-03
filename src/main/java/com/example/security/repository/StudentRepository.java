package com.example.security.repository;

import com.example.security.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,String>{
//        MongoRepository<Student, String> {

    List<Student> findAllByName(String name);
}
