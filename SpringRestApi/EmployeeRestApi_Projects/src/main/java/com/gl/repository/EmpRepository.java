package com.gl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.model.Emp;

@Repository
public interface EmpRepository extends JpaRepository<Emp, Integer>{

}
