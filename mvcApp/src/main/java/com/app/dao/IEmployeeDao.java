package com.app.dao;

import java.util.List;

import com.app.model.Employee;

public interface IEmployeeDao {

	List<Employee> getAllEmps();
	String insertEmp(Employee emp);
}
