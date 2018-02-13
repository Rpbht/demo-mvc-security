package com.cignex.rahul.demomvcsecurity.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import com.cignex.rahul.demomvcsecurity.model.Student;
import com.cignex.rahul.demomvcsecurity.utils.ConstatntsValues;

@Controller
public class StudentController {

	@RequestMapping(method = RequestMethod.GET, value = "/home")
	public String showWelcome() {
		return ConstatntsValues.HOME;
	}

/*	@RequestMapping(method = RequestMethod.GET, value = "/admin")
	public String showHome(WebRequest request, Model model, @AuthenticationPrincipal UserDetails userDetails) {
		
		Student student = new Student();
		model.addAttribute("student", student);
		System.out.println(userDetails.getUsername());
		
		return ConstatntsValues.DASH;
	}*/
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/admin")
	public String showHome() {
		
		return ConstatntsValues.HOME;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/addUser")
	public String addUser() {
		return ConstatntsValues.HOME;
	}

}
