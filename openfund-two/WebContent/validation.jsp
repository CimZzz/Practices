<%@page import="edu.fzu.openfund.service.AdminServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	AdminServiceImpl aImpl=new AdminServiceImpl();
    	Boolean flag=aImpl.validate(request.getParameter("name"), request.getParameter("pwd"));
    	
    	if(flag)
    	{
    		request.getSession().setAttribute("username", request.getParameter("name"));
    		
   	%>
   			<jsp:forward page="index.jsp"></jsp:forward>
   	<% 
    	}
    	else{
   	%>
   			<jsp:forward page="logfail.jsp"></jsp:forward>
   	<%
    	}
    %>
    
