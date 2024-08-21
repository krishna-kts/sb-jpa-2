package com.kts.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kts.entities.Student;
import java.util.List;


//@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {
	
	Iterable<Student> findAllByStudentCourse(String course);

	List<Student> findAllByStudentCourseAndStudentLocation(String studentCourse, String studentLocation);
	
	List<Student> findAllByStudentFeesGreaterThanEqual(Double fees);
	
	@Query("From Student where studentCourse = :course")
	List<Student> ShowStudentsUsingCourse(String course);
	
	@Query(value =  "select * from student where student_location=?", nativeQuery = true)
	List<Student> showStudentsUsingLocation(String location);
	
	
}
