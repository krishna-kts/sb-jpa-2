package com.kts.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kts.entities.Student;
import com.kts.repo.StudentRepo;

@Service
public class StudentService {
	StudentRepo studentRepo;
	
	public StudentService(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}
	
	public void addStudent() {
		Student s1 = new Student();
		s1.setStudentRno(2);
		s1.setStudentName("aparna");
		s1.setStudentCourse("python");
		s1.setStudentFees(5000);
		s1.setStudentLocation("kakinada");
		
		studentRepo.save(s1);					//upsert
	}
	
	
	public void addMultipleStudents() {
		Student s1 = new Student();
		s1.setStudentRno(5);
		s1.setStudentName("rajendra");
		s1.setStudentCourse("java");
		s1.setStudentFees(5000);
		s1.setStudentLocation("vizag");
		
		
		Student s2 = new Student();
		s2.setStudentRno(6);
		s2.setStudentName("syam");
		s2.setStudentCourse("aws");
		s2.setStudentFees(7000);
		s2.setStudentLocation("kakinada");
		
		List<Student> list = Arrays.asList(s1, s2);
		
		studentRepo.saveAll(list);
	}
	
	public long getStudentsCount() {
		return studentRepo.count();
	}
	
	public void getStudentByRno(int rno) {
		Optional<Student> optional = studentRepo.findById(rno);
		if(optional.isPresent()) {
			Student student = optional.get();
			System.out.println(student);
		}
	}
	
	public void getStudentsByMultipleRno() {
		List<Integer> list = Arrays.asList(2, 4, 6);
		Iterable<Student> iterable = studentRepo.findAllById(list);
		for(Student s :iterable) {
			System.out.println(s);
		}
	}
	
	public void getAllStudents() {
		Iterable<Student> iterable = studentRepo.findAll();
		for(Student s :iterable) {
			System.out.println(s);
		}
	}
	
	public boolean isStudentExist(int rno) {
		return studentRepo.existsById(rno);
	}
	
	
	public void deleteStudentByRno(int rno) {
		studentRepo.deleteById(rno);
	}
	
	public void deleteStudent() {
		Student s1 = new Student();
		s1.setStudentRno(6);
		
		studentRepo.delete(s1);
	}
	
	public void deleteMultipleStudentsByRno() {
		List<Integer> list = Arrays.asList(5, 6);
		studentRepo.deleteAllById(list);
	}
	
	public void deleteMultipleStudents() {
		Student s1 = new Student();
		s1.setStudentRno(5);
		
		Student s2 = new Student();
		s2.setStudentRno(6);
		
		List<Student> list = Arrays.asList(s1, s2);
		
		studentRepo.deleteAll(list);
	}
	
	public void deleteAllStudents() {
		
		studentRepo.deleteAll();
	}
	
	
	
	
	
	
	public void getStudentsByCourse(String course) {
		Iterable<Student> iterable = studentRepo.findAllByStudentCourse(course);
		for(Student s :iterable) {
			System.out.println(s);
		}
	}
	
	public void getStudentsByCourseAndLocation(String course, String location) {
		List<Student> list = studentRepo.findAllByStudentCourseAndStudentLocation(course, location);
		list.forEach(System.out::println);
	}
	
	public void getStudentsByFeesAbove(Double fees) {
		List<Student> list = studentRepo.findAllByStudentFeesGreaterThanEqual(fees);
		list.forEach(System.out::println);		
	}
	
	public void showStudentsCourseWise(String course) {
		List<Student> list = studentRepo.ShowStudentsUsingCourse(course);
		list.forEach(System.out::println);
	}
	
	public void showStudentsLocationWise(String location) {
		List<Student> list = studentRepo.showStudentsUsingLocation(location);
		list.forEach(System.out::println);
	}
}
