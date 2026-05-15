package com.ibm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.model.Student;
import com.ibm.service.StudentService;


//@Controller+@ResponseBody
@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService service;
		
	//fetch all students
//	@GetMapping("/all")
//	public List<Student> getStudents(){
//		return service.getAllStudents();
//	}
	
	//create student
//	@GetMapping("/add")
//	public List<Student> add(){
//		return service.addStudent(new Student(104,"Shehnaz", "EEE"));
//	}
	
	//update student
//	@PostMapping("/{id}")
//	public List<Student> update(int id){
//		return service.updateStudent(id);
//		
//	}
	//delete student
//	@GetMapping("/delete")
//	public List<Student> delete(){
//		return service.deleteStudent(1);
//		
//	}
	
	//fetch by id
	@GetMapping("/byid")
	public Student fetch(){
		return service.getStudentbyId(101);
		
		
	}

}
