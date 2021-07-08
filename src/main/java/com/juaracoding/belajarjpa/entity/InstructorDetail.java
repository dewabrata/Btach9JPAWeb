package com.juaracoding.belajarjpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//LOMBOK
@Data  //getter setter tostring
@AllArgsConstructor  //constructor argument
@NoArgsConstructor   //constructor no argument

//JPA
@Entity
@Table(name="instructor_detail")

public class InstructorDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String hobby;
	private String youtube_channel;
}
