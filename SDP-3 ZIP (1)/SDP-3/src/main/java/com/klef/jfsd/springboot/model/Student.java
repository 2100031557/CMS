package com.klef.jfsd.springboot.model;

import javax.persistence.*;

@Entity
@Table(name="student_table")
public class Student {
	
	@Id 
	@GeneratedValue 
	private int id;
	@Column(nullable=false,length=200)
	private String name;
	@Column(nullable=false)
	private String gender;
	@Column(nullable=false)
	private String dob; //date of birth
	@Column(nullable=false)
	private String department; //cse  or ece
	@Column(nullable=false)
	private String programm; // Btech or Mtech
	@Column(nullable=false)
	private double cgpa;
	@Column(nullable=false)
	private int backlogs;
	@Column(nullable=false,length=200,unique=true)
	private String emailid;
	@Column(nullable=false,length=200,unique=true)
	private String contactno;
	@Column(nullable=false,length=200)
	private String location;
	@Column(nullable = false,unique = true,length = 200)
	   private String username;
	  @Column(nullable = false,length = 200)
	   private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getProgramm() {
		return programm;
	}
	public void setProgramm(String programm) {
		this.programm = programm;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public int getBacklogs() {
		return backlogs;
	}
	public void setBacklogs(int backlogs) {
		this.backlogs = backlogs;
	}
	public String getEmailid() {
		return emailid;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", dob=" + dob + ", department="
				+ department + ", programm=" + programm + ", cgpa=" + cgpa + ", backlogs=" + backlogs + ", emailid="
				+ emailid + ", contactno=" + contactno + ", location=" + location + ", username=" + username
				+ ", password=" + password + "]";
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
   
}
