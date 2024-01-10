package com.SBApplication.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SBApplication.Beans.Student;
import com.SBApplication.Repos.StudentRepository;

@Component
public class StudentService {
	@Autowired
	StudentRepository studentRepository;

	public Student saveStudent(Student std) {
		return studentRepository.save(std);
	}
	
	public Student getStudent(Integer id) {
		return studentRepository.findById(id).get();
	}
	
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
	public void deleteStudentById(Integer id) {
		 studentRepository.deleteById(id);
	}

	public void updateStudent(Student std) {
		studentRepository.save(std);
	}
}
