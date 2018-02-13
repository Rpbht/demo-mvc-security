package com.cignex.rahul.demomvcsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cignex.rahul.demomvcsecurity.model.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	Student findByFName(String fName);
}
