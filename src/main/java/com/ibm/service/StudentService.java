package com.ibm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.model.Student;

@Service
public class StudentService {

	List<Student> li=new ArrayList<Student>();
	
	public StudentService() {
		li.add(new Student(101,"Sangitha" ,"IT"));
		li.add(new Student(102,"Anu" ,"CSE"));
		li.add(new Student(103,"Priya" ,"ECE"));
	}
	
	//fetch all students
	public List<Student> getAllStudents() {
		
		return li;
	}

	//update student
//	public List<Student> updateStudent(int id) {
//		
//		return null;
//	}

	public List<Student> addStudent(Student st) {
		li.add(st);
		return li;
	}

	//fetch by id
	public Student getStudentbyId(int id) {
		int i= li.indexOf(id);
		return li.get(i);
	
	}

//	public List<Student> deleteStudent(int id) {
//		li.remove(id);
//		return li;
//	}

}
