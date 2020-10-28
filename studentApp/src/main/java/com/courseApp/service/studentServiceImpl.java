package com.courseApp.service;
import com.courseApp.exception.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookApp.exception.bookNotFoundException;
import com.courseApp.dao.studentRepository;
import com.courseApp.model.Student;
import com.student.exceptions.StudentNotFoundException;

@Service
public class studentServiceImpl implements studentService {
	@Autowired
	studentRepository studentRepository;
	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		Student newstudent= studentRepository.save(student);
		return newstudent;
	}

	@Override
	public Student getStudent(int id) throws com.courseApp.exception.StudentNotFoundException {
		return studentRepository.findById(id).orElseThrow(()-> new StudentNotFoundException("Id not available") );
	}

	@Override
	public boolean deleteStudent(int id) {
		studentRepository.deleteById(id);
		return true;
	}

	@Override
	public List<Student> getStudentByCity(String city) {
		// TODO Auto-generated method stub
		return studentRepository.findByCity(city);
	}

	@Override
	public List<Student> getStudentByDept(String dept) throws com.courseApp.exception.StudentNotFoundException {
		// TODO Auto-generated method stub
		List<Student> studentList=studentRepository.findByDept(dept);
		if( studentList.isEmpty())
		{
			throw new StudentNotFoundException("Invalid department");
		}
		return studentList;
	}



	@Override
	public List<Student> findStudentByAge(int age) {
		// TODO Auto-generated method stub
		return studentRepository.findByAge(age);
	}

}
