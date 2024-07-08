package DesignPatterns.SBApplication.Services;

import java.util.List;

import javax.transaction.Transactional;

import DesignPatterns.SBApplication.Beans.Course;
import DesignPatterns.SBApplication.Repos.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
