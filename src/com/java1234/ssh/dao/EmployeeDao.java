package com.java1234.ssh.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java1234.ssh.entity.Department;
import com.java1234.ssh.entity.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;
	

	public EmployeeDao() {
	}
	
	public Session getsession(){
		
		return sessionFactory.getCurrentSession();
		//return sessionFactory.openSession();
	}
	
	public List<Employee> getAll(){
		String hql="FROM Employee e LEFT OUTER JOIN FETCH e.dept_FK";
		List<Employee> list = getsession().createQuery(hql).list();
		return list;
	}
	
	public void delete(Integer id){
		String hql="delete Employee e where e.id=?";
		getsession().createQuery(hql).setParameter(0, id).executeUpdate();
	}
	
	public Employee getEmpById(Integer id){
		Employee employee = (Employee)getsession().get(Employee.class, id);
		return employee;
	}
	
	public void add(Employee employee ){
		employee.setCreate_time(new Date());
		getsession().save(employee);
		
	}
	
	public void update(Employee employee ){
		Employee empl = (Employee)getsession().get(Employee.class, employee.getId());
		empl.setEmpName(employee.getEmpName());
		empl.setEmail(employee.getEmail());
		empl.setDept_FK(employee.getDept_FK());
		empl.setBirth(employee.getBirth());
	}
	
}
