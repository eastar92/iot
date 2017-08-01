<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/common/header.jsp"%>
<%@ page import="java.sql.*"%>
<%@ page import="com.test.common.DBConn2"%>
<%@ page import="com.test.dto.UserInfo"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
		<div class="starter-template">
	<form method="get" action="<%=rootPath%>/board/board_update_ok.jsp">
	<table border="1" class='table table bordered table hover'>
	<tr><td>아이디:</td><td><%=userId%></td>
<tr><td>이름:</td><td><%=userName%></td>
<tr><td>나이:	</td><td><%=age%></td>
<tr><td>주소:</td><td><%=address%></td>
<tr><td>전화번호:</td><td><%=hp1%><%=hp2%><%=hp3%></td>
</table>


	</form>
	</div></div>
</body>
