<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String search = request.getParameter("search");

	switch(search){
		case "naver":
			response.sendRedirect("https://www.naver.com/");
			break;
		case "daum":
			response.sendRedirect("https://www.daum.net/");
			break;
		case "nate":
			response.sendRedirect("https://www.nate.com/");
			break;
		case "google":
			response.sendRedirect("https://www.google.co.kr/");
			break;
	}

	/* if(search.equals("naver")){
		response.sendRedirect("https://www.naver.com/");
	}else if(search.equals("daum")){
		response.sendRedirect("https://www.daum.net/");
	} else if(search.equals("nate")){
		response.sendRedirect("https://www.nate.com/");
	} else if(search.equals("google")){ 
		response.sendRedirect("https://www.google.co.kr/");
	}  */
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
