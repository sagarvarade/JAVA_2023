package DesignPatterns.SBApplication.Repos;

import DesignPatterns.SBApplication.Beans.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	//Student findById(int id);
}
