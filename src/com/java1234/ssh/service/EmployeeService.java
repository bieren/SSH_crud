package com.java1234.ssh.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java1234.ssh.dao.EmployeeDao;
import com.java1234.ssh.entity.Department;
import com.java1234.ssh.entity.Employee;
import com.sun.corba.se.spi.orbutil.fsm.Input;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public EmployeeService() {
	}


	@Transactional
	public String Input(Employee employee){
		if(employee.getId()==null){
			
			employeeDao.add(employee);
		}else{
			employeeDao.update(employee);
			
			employee=employeeDao.getEmpById(employee.getId());
		}
		return "success";
	}
	
	@Transactional
	public Employee getEmpById(Integer id){
		return employeeDao.getEmpById(id);
	}
	
	@Transactional
	public String delete(Integer id){
		employeeDao.delete(id);
		return "success";
	}

	/**
	 * Ö»¶Á
	 * @return
	 */
	@Transactional(readOnly=true)
	public List<Employee> list(){
		return this.employeeDao.getAll();
	}
	
}
