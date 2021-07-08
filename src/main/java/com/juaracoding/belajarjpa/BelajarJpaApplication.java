package com.juaracoding.belajarjpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.juaracoding.belajarjpa.entity.Course;
import com.juaracoding.belajarjpa.entity.Instructor;
import com.juaracoding.belajarjpa.entity.InstructorDetail;
import com.juaracoding.belajarjpa.entity.Student;
import com.juaracoding.belajarjpa.interfaces.CourseRepository;
import com.juaracoding.belajarjpa.interfaces.InstructorRepository;
import com.juaracoding.belajarjpa.interfaces.StudentRepository;

@SpringBootApplication
public class BelajarJpaApplication implements CommandLineRunner{
	
	@Autowired
    InstructorRepository instructorRepository;
	
	@Autowired
	CourseRepository courseRepository;
	
	@Autowired
	StudentRepository studentRepository;

	
	
	public static void main(String[] args) {
		SpringApplication.run(BelajarJpaApplication.class, args);
		
		
		
	
	}



	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
	/*   InstructorDetail detail1 = new InstructorDetail(0,"mancing","dewabrata");	
       Instructor instructor = new Instructor(0,"dewabrata@gmail.com","dewa","brata",detail1);
       InstructorDetail detail2 = new InstructorDetail(0,"menari","dewi");
       Instructor instructor2 = new Instructor(0,"dewi@gmail.com","dewi","cinta",detail2);
       InstructorDetail detail3 = new InstructorDetail(0,"kemping","dewo");
       Instructor instructor3 = new Instructor(0,"dewo@gmail.com","dewo","aja",detail3);
       List <Instructor> lstInstructor = new ArrayList<Instructor>();
       lstInstructor.add(instructor);
       lstInstructor.add(instructor2);
       lstInstructor.add(instructor3);
       
	   this.instructorRepository.saveAll(lstInstructor);
	   
	   List<Instructor> lstData = this.instructorRepository.findAll();
	   
	   for (Instructor instructorx : lstData) {
		   
		  System.out.println( instructorx.toString());
		
	}
	   */
		
//		
//		List<Student> lstStudent = new ArrayList<Student>();
//		List<Course> lstCourses = new ArrayList<Course>();
//		
//		Course course = new Course(0,"Bahasa Inggris",200000.0,10,"English Course",lstStudent);
//		Course course2 = new Course(0,"Bahasa Jepang",2000000.0,10,"Jepang Course",lstStudent);
//		Course course3 = new Course(0,"Bahasa Kalbu",100000.0,10,"Jepang Course",lstStudent);
//		lstCourses.add(course);
//		lstCourses.add(course2);
//		//lstCourses.add(course3);
//		
//		Student student = new Student();
//		student.setName("Sidiq");
//		student.setAge(40);
//		student.setGrade("B");
//		student.setLstCourse(lstCourses);
////		Student student2 = new Student();
////		student2.setName("Aqil");
////		student2.setAge(30);
////		student2.setGrade("B");
//		
//		lstStudent.add(student);
//		//lstStudent.add(student2);
//		
//		
//		
//		this.studentRepository.saveAll(lstStudent);
//		List<Student> listData = (List<Student>) this.studentRepository.findAll();
//		
//		
//	for (Student students : listData ) {
//			
//		System.out.print(students.getName());
//			for (Course kurs : student.getLstCourse()) {
//				 
//				System.out.println(kurs.getTitle() + kurs.getFee());
//			}
//			
//		}
//	
//		
		
	   
	}

}
