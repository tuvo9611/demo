package com.example.security.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "product")
public class Student {

    @Id
    private String _id;
    private String name;
    private String address;
    private String phone;
}
