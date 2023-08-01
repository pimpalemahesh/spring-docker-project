package com.springboot.SpringCRUD.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.SpringCRUD.model.Student;
import com.springboot.SpringCRUD.repository.dataRepository;

@RestController
public class AppController {
    
    @Autowired
    private dataRepository repository;

    @GetMapping
    public String home(){
        return "Welcome to Springboot-CRUD application";
    }

    @GetMapping("/students")
    public List<Student> getStudent(){
        List<Student> list = new ArrayList<>();
        list = repository.findAll();
        return list;
    }
}
