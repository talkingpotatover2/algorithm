<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>1부터 <%=request.getParameter("num")%>까지 자연수 합 구하기</h2>
<%
	int num = Integer.parseInt(request.getParameter("num"));
	int sum = 0;

	for(int i=1; i<=num; i++){
		out.print(i);
		sum += i;
		if(i == num){
			break;
		}
		out.print("+");
	}  %>
	<%=" = " + sum %>

<%-- <h2>1부터 10까지 자연수 합 구하기</h2>
<% 
	String num = request.getParameter("num");
	int n = Integer.parseInt(num);
	int sum = 0;
	
	for(int i=1; i<=n; i++){
		out.print(i);
		sum += i;
		if(i == n){
			break;
		}
		out.print("+");
	}
	out.print(" = " + sum);
%> --%>
</body>
</html>