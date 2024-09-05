package com.klef.jfsd.springboot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Faculty;
import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.service.AdminService;
import com.klef.jfsd.springboot.service.FacultyService;
import com.klef.jfsd.springboot.service.StudentService;

@Controller
public class clientcontroller {
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private FacultyService facultyService;
	
	@Autowired
	private StudentService studentService;
	

	@GetMapping("/")
	public String mainhomedemo()
	{
		return "index";
	}
	
	@GetMapping("/adminlogin")
	public ModelAndView adminlogindemo()
	{
		ModelAndView mv = new ModelAndView("adminlogin");
		
		return mv;
	}
	@GetMapping("/facultylogin")
	public ModelAndView facultylogindemo()
	{
		ModelAndView mv = new ModelAndView("facultylogin");
		
		return mv;
	}
	@GetMapping("/studentlogin")
	public ModelAndView studentlogindemo()
	{
		ModelAndView mv = new ModelAndView("studentlogin");
		
		return mv;
	}

	@PostMapping("/checkadminlogin")
	public ModelAndView checkadminlogindemo(HttpServletRequest request)
	{
		ModelAndView mv =  new ModelAndView();
		
		String auname = request.getParameter("auname");
		String apwd = request.getParameter("apwd");
		
		Admin admin = adminService.checkadminlogin(auname, apwd);
		
		if(admin!=null)
		{
			
			HttpSession session = request.getSession();
			
			session.setAttribute("auname", auname);
			
			mv.setViewName("adminhome");
		}
		else
		{
			mv.setViewName("adminlogin");
			mv.addObject("msg", "Login Failed");
		}
		
		
		return mv;
	}
	
	@PostMapping("/checkfacultylogin")
	public ModelAndView checkemplogindemo(HttpServletRequest request)
	{
		ModelAndView mv =  new ModelAndView();
		
		String euname = request.getParameter("euname");
		String epwd = request.getParameter("epwd");
		
		Faculty fac = facultyService.checkfacultylogin(euname, epwd);
		
		if(fac!=null)
		{
			HttpSession session = request.getSession();
			
			session.setAttribute("euname", euname);
			
			mv.setViewName("facultyhome");
		}
		else
		{
			mv.setViewName("facultylogin");
			mv.addObject("msg", "Login Failed");
		}
		
		
		return mv;
	}
	@PostMapping("/checkstudentlogin")
	public ModelAndView checkstudentlogindemo(HttpServletRequest request)
	{
		ModelAndView mv =  new ModelAndView();
		
		String euname = request.getParameter("euname");
		String epwd = request.getParameter("epwd");
		
		Student stu = studentService.checkstudentlogin(euname, epwd);
		
		if(stu!=null)
		{
			HttpSession session = request.getSession();
			
			session.setAttribute("euname", euname);
			
			mv.setViewName("studenthome");
		}
		else
		{
			mv.setViewName("studentlogin");
			mv.addObject("msg", "Login Failed");
		}
		
		
		return mv;
	}
	
	@GetMapping("/adminhome")
	public ModelAndView adminhomedemo()
	{
		ModelAndView mv = new ModelAndView("adminhome");
		
		return mv;
	}
	@GetMapping("/facultyhome")
	public ModelAndView facultyhomedemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView("facultyhome");
		
		HttpSession session = request.getSession();
		
		String euname = (String) session.getAttribute("euname");
		
		mv.addObject("euname", euname);
		
		return mv;
	}
	@GetMapping("/studenthome")
	public ModelAndView studenthomedemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView("studenthome");
		
		HttpSession session = request.getSession();
		
		String euname = (String) session.getAttribute("euname");
		
		mv.addObject("euname", euname);
		
		return mv;
	}
	
	@PostMapping("/addfaculty")
	public String addfacultydemo(@ModelAttribute("fac") Faculty faculty)
	{
		adminService.addfaculty(faculty);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addfaculty");
		mv.addObject("msg", "Faculty Added Successfully");
		return "redirect:adminhome";
	}
	
	
}
