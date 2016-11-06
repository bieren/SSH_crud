<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:debug></s:debug>
	<s:form action="emp_save" method="post">
		<s:hidden name="employee.id"></s:hidden>
		<s:textfield name="employee.empName" label="姓名"></s:textfield>
		<%-- <s:textfield name="employee.dept_FK.deptName" label="部门"></s:textfield> --%>
		<s:select label="部门" list="#request.departments" listKey="deptId"
			listValue="deptName" name="employee.dept_FK.deptId">
		</s:select>
		<!-- 当该属性压入栈顶后  可以直接属性名使用  无须写成：对象.属性 -->
		<s:textfield name="employee.email" label="电子邮箱"></s:textfield>
		<s:textfield name="employee.birth" label="出生日期"></s:textfield>
		<s:submit value="提交"></s:submit>
	</s:form>

</body>
</html>