package com.cignex.rahul.demomvcsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import com.cignex.rahul.demomvcsecurity.model.Student;
import com.cignex.rahul.demomvcsecurity.utils.ConstatntsValues;

@Controller
public class StudentController {

	@RequestMapping(method=RequestMethod.GET,value="/home")
	public String showHome(WebRequest request, Model model){
		Student student = new Student();
		model.addAttribute("student",student);
		return ConstatntsValues.HOME;
	}
	
}
