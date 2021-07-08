package com.juaracoding.belajarjpa.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juaracoding.belajarjpa.entity.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor,Long>{

}
