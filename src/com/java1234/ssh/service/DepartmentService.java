package com.java1234.ssh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java1234.ssh.dao.DepartmentDao;
import com.java1234.ssh.entity.Department;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentDao departmentDao;
	
	@Transactional(readOnly=true)
	public List<Department> getAll(){
		return departmentDao.getAll();
	}
	@Transactional
	public Department getDeptById(Integer id){
		return departmentDao.getDeptById(id);
	}
}
