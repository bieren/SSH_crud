package com.java1234.ssh.entity;

import java.util.Date;

public class Employee {

	private Integer id;
	private String empName;
	private String email;
	private Date birth;
	private Date create_time;
	private Department dept_FK;
	public Employee() {
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Department getDept_FK() {
		return dept_FK;
	}
	public void setDept_FK(Department dept_FK) {
		this.dept_FK = dept_FK;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", email=" + email + ", birth=" + birth
				+ ", create_time=" + create_time + ", dept_FK=" + dept_FK + "]";
	}

	
	

}
