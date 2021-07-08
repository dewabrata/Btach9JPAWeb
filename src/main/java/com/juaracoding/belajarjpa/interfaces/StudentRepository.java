package com.juaracoding.belajarjpa.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.juaracoding.belajarjpa.entity.Instructor;
import com.juaracoding.belajarjpa.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Long>{
      
	  public Student findByName(String name);
}
