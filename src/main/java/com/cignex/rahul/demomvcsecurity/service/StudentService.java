package com.cignex.rahul.demomvcsecurity.service;

import org.springframework.stereotype.Service;

import com.cignex.rahul.demomvcsecurity.model.Student;
import com.cignex.rahul.demomvcsecurity.repository.StudentRepository;

@Service
public class StudentService {

	private StudentRepository repository;

	public Student isValid (String fName){	return repository.findByFName(fName);}
}
