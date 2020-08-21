package com.app.school.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/school")
public class StudentController {

	@GetMapping("/student")
	String getStudent() {
		return "Ankita";
	}
}
