package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository repo;
	
	@PostMapping("/student/create")
	public Student createStudent(@RequestBody Student student) {
		return repo.save(student);
	}
	
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable Long id) {
		return repo.findById(id).get();
	}

}
