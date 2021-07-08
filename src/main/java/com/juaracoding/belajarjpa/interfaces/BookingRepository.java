package com.juaracoding.belajarjpa.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juaracoding.belajarjpa.entity.BookingModel;
import com.juaracoding.belajarjpa.entity.Course;
import com.juaracoding.belajarjpa.entity.Instructor;

public interface BookingRepository extends JpaRepository<BookingModel,Long>{

}
