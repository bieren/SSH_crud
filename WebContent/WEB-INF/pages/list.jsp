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
<s:a action="emp_input">添加</s:a>
	<s:if test="#request.employees.size == 0">
	没有任何employee数据
	</s:if>
	<s:else>
		<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<td>编号</td>
				<td>姓名</td>
				<td>部门</td>
				<td>电子邮箱</td>
				<td>出生日期</td>
				<td>登记时间</td>
				<td>编辑</td>
				<td>删除</td>
			</tr>
			<s:iterator value="#request.employees">
				<tr>
					<td>${id }</td>
					<td>${empName}</td>
					<td>${dept_FK.deptName }</td>
					<td>${email}</td>
					<td><s:date name="birth" format="yyyy-MM-dd" /></td>
					<td><s:date name="create_time" format="yyyy-MM-dd hh:mm:ss" /></td>
					<td><a href="emp_input?id=${id }">编辑</a></td>
					<td><a href="emp_delete?id=${id }">删除</a></td>
				</tr>
			</s:iterator>
		</table>


	</s:else>



</body>
</html>