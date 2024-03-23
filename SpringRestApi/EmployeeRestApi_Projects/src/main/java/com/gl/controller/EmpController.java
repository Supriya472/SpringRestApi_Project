package com.gl.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.model.Emp;
import com.gl.repository.EmpRepository;
import com.gl.service.EmpServiceImpl;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	EmpServiceImpl empservice;
	
	@GetMapping("/home")
	public String homePage() {
		return "Welcome to home page";
	}
	
	@PostMapping("/addEmp")
	public ResponseEntity<Emp> addEmp(@RequestBody Emp emp){
		Emp employee=empservice.addEmp(emp);
		return new ResponseEntity<Emp>(emp,HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/deleteEmp/{id}")
	public ResponseEntity<String> deleteEmp(@PathVariable int id){
		empservice.deleteEmp(id);
		return new ResponseEntity<String>("delete seccessfully",HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/findEmp/{id}")
	public ResponseEntity<Optional<Emp>> findEmpById(@PathVariable int id){
		Optional<Emp> emps=empservice.findEmpById(id);
		return new ResponseEntity<Optional<Emp>>(emps,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/all/{id}")
	public ResponseEntity<List<Emp>> listOfEmp(){
		List<Emp> lEmp=empservice.getAllEmp();
		return new ResponseEntity<List<Emp>>(lEmp,HttpStatus.ACCEPTED);
		
		
	}
	
	@PatchMapping("/updateEmp/{id}")
	public ResponseEntity<String> updateEmp(@PathVariable int id){
		empservice.updateEmp(id);
		return new ResponseEntity<String>("update seccessfully",HttpStatus.ACCEPTED);
	}
		
	
	
	

}
