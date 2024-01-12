package com.SBApplication.Services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SBApplication.Beans.Course;
import com.SBApplication.Beans.Student;
import com.SBApplication.Repos.CourseRepository;
import com.SBApplication.Repos.StudentRepository;

@Component
public class StudentService {
	@Autowired
	StudentRepository studentRepository;

	@Autowired
	CourseRepository courseRepository;

	public Student saveStudent(Student std) {
		Student std1 = studentRepository.save(std);
		for (Course crs : std.getCourses()) {
			crs.setStudent(std);
			courseRepository.save(crs);
		}
		return std1;
	}

	public Student getStudent(Integer id) {
		Student std = studentRepository.findById(id).get();
		//Course byStudentId = courseRepository.getByStudentId(id);
		//std.setCourses(Set.of(byStudentId));
		return std;
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
