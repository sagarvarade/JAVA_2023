package com.SBApplication.Services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SBApplication.Beans.Course;
import com.SBApplication.Repos.CourseRepository;

@Component
public class CourseService {
	@Autowired
	CourseRepository courseRepository;

	public Course courseSave(Course crs) {
		return courseRepository.save(crs);
	}

	
	@Transactional
    public List<Course> getCoursesByStudentId(Long studentId) {
        return courseRepository.findByStudentId(studentId);
    }
}
