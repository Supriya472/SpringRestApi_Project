package com.gl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.model.Emp;
import com.gl.repository.EmpRepository;
@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	EmpRepository emprepo;

	@Override
	public Emp addEmp(Emp emp) {
		Emp employee=emprepo.save(emp);
		return employee;
	}

	@Override
	public String deleteEmp(int id) {
		emprepo.deleteById(id);
		return "Delete data successfully";
	}

	@Override
	public Optional<Emp> findEmpById(int id) {
		Optional<Emp> emp=emprepo.findById(id);
		if(emp.isPresent()) {
			return emp;
		}else {
		return null;
	}
	}

	@Override
	public List<Emp> getAllEmp() {
		List<Emp> empList=emprepo.findAll();
		return empList;
	}

	@Override
	public String updateEmp(int id) {
		Optional<Emp> emp=emprepo.findById(id);
		if(emp.isPresent()) {
			Emp emps=new Emp();
			emprepo.save(emps);
			return "update successfully";
		}else {
		return "emp not found";
	}
	}
}


