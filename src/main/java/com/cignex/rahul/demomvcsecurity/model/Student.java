package com.cignex.rahul.demomvcsecurity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="student_tbl")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@NotEmpty
	private String fName;

	@NotNull
	@NotEmpty
	private String lName;
	
	@NotNull
	@NotEmpty
	private String password;
	
	public Student() {
		super();
	}

	public Student(long id, @NotNull @NotEmpty String fName, @NotNull @NotEmpty String lName,@NotNull @NotEmpty String password) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.password=password;
	}

	public Student(@NotNull @NotEmpty String fName,@NotNull @NotEmpty String password) {

		this.fName = fName;
		this.password=password;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fName=" + fName + ", lName=" + lName + ", password=" + password + "]";
	}
	
}
