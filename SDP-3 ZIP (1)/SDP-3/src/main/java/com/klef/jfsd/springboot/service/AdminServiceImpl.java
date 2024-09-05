package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Faculty;
import com.klef.jfsd.springboot.repository.AdminRepository;
import com.klef.jfsd.springboot.repository.FacultyRepository;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private FacultyRepository facultyRepository;

	@Override
	public Admin checkadminlogin(String uname, String pwd) {
		return adminRepository.checkadnminlogin(uname, pwd);
	}

	@Override
	public Faculty addfaculty(Faculty faculty) {

		return facultyRepository.save(faculty);
		
	}



}
