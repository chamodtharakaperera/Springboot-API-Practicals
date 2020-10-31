
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dynamic Web page</title>
</head>
<body>

<%="Udeesha Bandara Kalumahanage "%><!-- expression  --><br/>
<%!%>
<% int i=10;
	int u=32;
	out.println(i+u);out.print("<br>");
	out.println( "nibm <br>");
	List<String>list=new ArrayList<>();
	list.add("testing");
	out.println(list.get(0));
	 /*public void loop()
	 {
	 	for(int k=0;k<11;k++)
	 	{
	 		out.print(k);
	 		
	 	}


	 }*/
	%> 
	
 <%-- Scriptlet --%>

</body>
</html>