package com.java1234.ssh.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java1234.ssh.entity.Department;

@Repository
public class DepartmentDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession(){
		return this.sessionFactory.getCurrentSession();
	}

	public List<Department> getAll(){
		String hql="FROM Department dept";
		//让Query对象调用setCacheable(true)表示将第一次查询的结果保存到缓存中
		return this.getSession().createQuery(hql).setCacheable(true).list();
	}
	
	public Department getDeptById(Integer id){
		Department department = (Department)getSession().get(Department.class, id);
		return department;
	}
	
}
