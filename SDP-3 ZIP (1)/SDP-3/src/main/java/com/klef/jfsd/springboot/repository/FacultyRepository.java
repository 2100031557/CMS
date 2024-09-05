package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.klef.jfsd.springboot.model.Faculty;

@Repository
public interface FacultyRepository extends CrudRepository<Faculty, Integer>{
 
	@Query("select f from Faculty f where username=?1 and password=?2")
	public Faculty checkfacultylogin(String uname,String pwd);
	

}
