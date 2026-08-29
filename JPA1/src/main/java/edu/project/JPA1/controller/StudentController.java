package edu.project.JPA1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.project.JPA1.entity.Student;
import edu.project.JPA1.repo.StudentRepo;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	private final StudentRepo studentRepo;
	
	public StudentController(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}
	
	@PostMapping
	public Student createStudent(@RequestBody Student student) {
		return studentRepo.save(student);
	}
	
	@GetMapping
	public List<Student> getAllStudents(){
		return studentRepo.findAll();
	}
}
