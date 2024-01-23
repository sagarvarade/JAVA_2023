package com.SBApplication.Services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SBApplication.Beans.Course;
import com.SBApplication.Beans.Student;
import com.SBApplication.Repos.CourseRepository;
import com.SBApplication.Repos.StudentRepository;

@Component
@org.springframework.transaction.annotation.Transactional
public class StudentService {
	@Autowired
	StudentRepository studentRepository;

	@Autowired
	CourseRepository courseRepository;

	public Student saveStudent(Student std) {
		Student std1 = studentRepository.save(std);
		/*for (Course crs : std.getCourses()) {
			crs.setStudent(std);
			courseRepository.save(crs);
		}*/
		return std1;
	}

	@org.springframework.transaction.annotation.Transactional
    public Optional<Student> getStudentById(Integer id) {
        return studentRepository.findById(id);
    }

	@org.springframework.transaction.annotation.Transactional
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
