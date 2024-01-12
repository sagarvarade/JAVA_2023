package com.SBApplication.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.SBApplication.Beans.Student;
import com.SBApplication.Services.StudentService;

@RestController
@RequestMapping("student")
public class StudentControllers {
 
	//@DeleteMapping ,@GetMapping , @PatchMapping ,@PostMapping, @PutMapping, @RequestMapping, 
	
	@Autowired
	StudentService studentService;

	@GetMapping("/getall")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@GetMapping("/getstudent/{id}")
	@ResponseBody
	public Student getStuedent(@PathVariable String id) {
		return studentService.getStudent(Integer.valueOf(id));
	}

	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student) {
		System.out.println(student);
		studentService.saveStudent(student);
		return null;
	}

	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public String deleteStudetn(@PathVariable String id) {
		studentService.deleteStudentById(Integer.valueOf(id));
		return "SUCCESS";
	}
	
	@PatchMapping("/patch")
	public String patchStudent(@RequestBody Student std) {
		studentService.updateStudent(std);
		return "Done";
	}
	
}
