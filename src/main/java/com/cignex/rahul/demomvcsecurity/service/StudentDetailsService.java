package com.cignex.rahul.demomvcsecurity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cignex.rahul.demomvcsecurity.model.Student;
import com.cignex.rahul.demomvcsecurity.repository.StudentRepository;

@Service
public class StudentDetailsService implements UserDetailsService {

	@Autowired
	private StudentRepository studentRepo;
	static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Student student = studentRepo.findByFName(username);
		List<SimpleGrantedAuthority> authList = new ArrayList<>();
		authList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		String encodedPassword = passwordEncoder.encode(student.getPassword());
		User user = new User(student.getfName(), encodedPassword, authList);
		System.out.println("From StudentDetailsService:=> "+user.getAuthorities());
		return user;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	

}
