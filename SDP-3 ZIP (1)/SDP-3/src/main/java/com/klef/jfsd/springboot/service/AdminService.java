package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Faculty;

public interface AdminService {
	
	public Admin checkadminlogin(String uname,String pwd);
	public Faculty addfaculty(Faculty faculty);

}
