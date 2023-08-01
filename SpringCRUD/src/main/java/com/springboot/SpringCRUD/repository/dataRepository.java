package com.springboot.SpringCRUD.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.springboot.SpringCRUD.model.Student;

@Repository
public interface dataRepository extends JpaRepositoryImplementation<Student, String>{
    
}
