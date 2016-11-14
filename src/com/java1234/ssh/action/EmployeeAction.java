package com.java1234.ssh.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.java1234.ssh.entity.Employee;
import com.java1234.ssh.service.DepartmentService;
import com.java1234.ssh.service.EmployeeService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

@Controller
@Scope(value = "prototype")
public class EmployeeAction extends ActionSupport implements RequestAware,ModelDriven<Employee>,Preparable{

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private DepartmentService departmentService;

	private Integer id;

	private Employee employee;

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public EmployeeAction() {
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String delete() {
		employeeService.delete(id);

		return "success";
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void prepareSave(){
		employee=new Employee();
		
	}
	
	public String input() {

		request.put("departments", departmentService.getAll());
		if (id != null) {

			employee = employeeService.getEmpById(id);
			//ActionContext.getContext().getValueStack().push(employee);
			System.out.println("===============com.java1234.ssh.action.EmployeeAction.input()================"+employee);
		}
		return "input";
	}

	public String save() {
		System.out.println("-------------------------------------updata------------------------------\n"
				+ employee);
		System.out.println("here is bieren-------------------------------------updata------------------------------\n"
				+ employee);

		return employeeService.Input(employee);
	}

	public String list() {
		request.put("employees", employeeService.list());
		return "list";
	}

	private Map<String, Object> request;

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	@Override
	public Employee getModel() {
		return employee;
	}

	@Override
	public void prepare() throws Exception {
		
	}

}
