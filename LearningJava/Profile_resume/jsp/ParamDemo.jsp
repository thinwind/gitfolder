<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.util.*,java.io.*;" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! int count=0; %>
<%
count++;

Enumeration en = request.getParameterNames();

while(en.hasMoreElements()){
	out.println(en.nextElement());
	out.println(en.nextElement());
}

%>
<%=count %>
</body>
</html>