package com.courseApp.service;

import java.util.List;

import com.courseApp.exception.StudentNotFoundException;
import com.courseApp.model.Student;

public interface studentService {

	Student addStudent(Student student);
	Student getStudent(int id) throws StudentNotFoundException;
	boolean deleteStudent(int id);
	
	List<Student> getStudentByCity(String city);
	List<Student> getStudentByDept(String dept) throws StudentNotFoundException;
	List<Student> findStudentByAge(int age);
	
}
