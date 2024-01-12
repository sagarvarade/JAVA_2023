package com.SBApplication.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SBApplication.Beans.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
	Course getByStudentId(Integer id);
}
