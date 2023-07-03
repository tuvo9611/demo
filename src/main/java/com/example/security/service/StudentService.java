package com.example.security.service;

import com.example.security.models.Student;
import com.example.security.repository.StudentRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repo;

    public Student create(Student student) {
        return repo.save(student);
    }

    public Student find(String id) {
        return repo.findById(id).orElse(null);
    }

//    public


}
