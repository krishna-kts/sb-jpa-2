package com.kts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kts.repo.StudentRepo;
import com.kts.services.StudentService;

@SpringBootApplication
public class SbJpa2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbJpa2Application.class, args);
		
		StudentService service = context.getBean(StudentService.class);
		
		//service.addStudent();
		
		//service.addMultipleStudents();
		
		//System.out.println("Total Students: "+service.getStudentsCount());
		
		//service.getStudentByRno(5);
		
		//service.getStudentsByMultipleRno();
		
		//service.getAllStudents();
		
		//System.out.println("Is Rno 5 Exists: "+service.isStudentExist(5));
		
		//service.deleteStudentByRno(6);
		
		//service.deleteStudent();
		
		//service.deleteMultipleStudentsByRno();
		
		//service.deleteMultipleStudents();
		
		//service.deleteAllStudents();
		
		
		//service.getStudentsByCourse("java");
		
		//service.getStudentsByCourseAndLocation("python", "kakinada");
		
		//service.getStudentsByFeesAbove(6000.0);
		
		//service.showStudentsCourseWise("java");
		
		//service.showStudentsLocationWise("kakinada");
	}

}
