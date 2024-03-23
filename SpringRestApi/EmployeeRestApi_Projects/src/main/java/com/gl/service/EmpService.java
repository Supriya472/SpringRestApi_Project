package com.gl.service;

import java.util.List;
import java.util.Optional;

import com.gl.model.Emp;

public interface EmpService {
	public Emp addEmp(Emp emp);
	public String deleteEmp(int id);
	public Optional<Emp> findEmpById(int id);
	public List<Emp> getAllEmp();
	public String updateEmp(int id);
	

}
