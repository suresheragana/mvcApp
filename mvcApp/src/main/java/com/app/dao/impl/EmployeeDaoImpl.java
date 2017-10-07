package com.app.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.dao.IEmployeeDao;
import com.app.model.Employee;

@Repository("dao")
public class EmployeeDaoImpl implements IEmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;
	public List<Employee> getAllEmps() {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		List<Employee> eList=criteria.list();
		session.close();
		return eList;
	}

	public String insertEmp(Employee emp) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(emp);
		tx.commit();
		session.close();
		String msg="inserted";
		
		
		return msg;
	}

	
	
	
}
