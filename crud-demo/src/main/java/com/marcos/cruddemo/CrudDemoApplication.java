package com.marcos.cruddemo;

import com.marcos.cruddemo.dao.StudentDAO;
import com.marcos.cruddemo.dao.StudentRepository;
import com.marcos.cruddemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating new Student object");
		Student newStudent = new Student("Marcos", "Test", "testing@email.com");

		System.out.println("Saving Student");
		studentDAO.save(newStudent);
		//studentRepository.save(newStudent);

		System.out.println("Saved Student with ID: " + newStudent.getId());
	}

}
