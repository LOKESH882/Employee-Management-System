package com.emb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emb.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
