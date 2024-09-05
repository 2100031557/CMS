package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{
	
	@Query("select s from Student s where username=?1 and password=?2")
	public Student checkstudentlogin(String uname,String pwd);

}
