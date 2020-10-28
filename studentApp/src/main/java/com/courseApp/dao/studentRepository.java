package com.courseApp.dao;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.courseApp.model.*;
import com.student.model.Student;
public interface studentRepository extends MongoRepository<Student,Integer>{
	
	List<Student>findByCity(String city);
	List<Student>findByDept(String dept);
	List<Student>findById(String id);
	
	
	@Query("from Student s where s.age=?1 ")
	List<Student> findByAge(int age);
	
}
