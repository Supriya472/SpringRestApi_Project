package com.gl.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String firstName;
	String lastName;
	String email;
	

}
