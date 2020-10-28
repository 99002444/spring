package com.courseApp.controller;
import com.courseApp.model.Student;
import com.courseApp.service.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student-api")
public class studentController {
	@Autowired
	studentService studentService;
	@PostMapping("/students")
	 ResponseEntity<Student> addStudent(@RequestBody Student student)
	 {
		Student nstudent=studentService.addStudent(student);
		return ResponseEntity.ok(nstudent);
	 }
	
	@DeleteMapping("/students/delete-one/{studentId}")
	ResponseEntity<Boolean> deleteStudentById(@PathVariable("studentId")Integer studentId) {
		studentService.deleteStudent(studentId);
		return ResponseEntity.status(HttpStatus.OK).build();

	}
	@GetMapping("/students/get-one/{studentId}")
	ResponseEntity<Student> getStudentById(@PathVariable("studentId") Integer studentId) throws StudentNotFoundException
	 {
		Student nStudent=studentService.getStudent(studentId);
		HttpHeaders header=new HttpHeaders();
		header.add("desc", "Getting Student By Id");
		header.add("title", "One Student");
		return ResponseEntity.status(HttpStatus.OK).headers(header).body(nStudent);
		
		
	 }
	/*@PutMapping("/books/update-one")
	ResponseEntity<Book> updateBook(Book book)
	 {
		Book nbook=bookService.updateBook(book);
		HttpHeaders header=new HttpHeaders();
		header.add("desc", "Updating Book By Id");
		header.add("title", "One Book");
		return ResponseEntity.status(HttpStatus.OK).headers(header).body(nbook);
	 }*/

	/* @GetMapping("/students/city/{city}")
	 ResponseEntity<List<Student>> findBycity(@PathVariable("city")String city) throws StudentNotFoundException{
	        List<Student> cityList =   studentService.findByCity(city);
	        return ResponseEntity.ok(cityList);
	    }*/
	 @GetMapping("/students/department/{department}")
	 ResponseEntity<List<Student>> findByDepartment(@PathVariable("department")String department)throws StudentNotFoundException{
	        List<Student> deptList = studentService.getStudentByDept(department);    
	        return ResponseEntity.ok(deptList);
	    }
	 @GetMapping("/students/age/{age}")
	 public ResponseEntity<List<Student>> findByAge(@PathVariable("age")int age) {
	        List<Student> ageList = studentService.findStudentByAge(age);
	        return ResponseEntity.ok(ageList);
	        
	    }
	
}
