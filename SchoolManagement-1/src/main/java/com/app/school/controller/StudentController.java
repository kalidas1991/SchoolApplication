package com.app.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.school.model.Student;
import com.app.school.repository.StudentRepository;
import com.app.school.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	StudentService studentService;
	@Autowired
	private final StudentRepository repository;

	StudentController(StudentRepository repository) {
		this.repository = repository;
	}

	@GetMapping(value = "/student")
	public List<Student> getStudent() {
		List<Student> li = repository.findAll();
		return li;
	}

}
