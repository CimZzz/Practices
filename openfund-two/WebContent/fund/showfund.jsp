<%@page import="edu.fzu.openfund.domain.Fund"%>
<%@page import="edu.fzu.openfund.service.FundServiceImpl"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<%
	List<Fund> list=(List<Fund>)request.getAttribute("AllFunds");
%>
<table>
	<tr>
		<td colspan="6">黄金产品查询结果</td>
	</tr>
	
	<tr>
		<td>基金编号</td>
		<td>基金产品名称</td>
		<td>基金产品价格</td>
		<td>基金产品状态</td>
		<td>基金创建时间</td>
		<td>操作</td>
	</tr>
<% 
	for(Fund fund : list)
	{
%>
	<tr>		
		<td><%= fund.getFundNo() %></td>
		<td><%= fund.getFundName() %></td>
		<td><%= fund.getFundPrice() %></td>
		<td><%= fund.getFundStatus() %></td>
		<td><%= fund.getFundCreateDate() %></td>
		<td>
			<button stlye="color='white';background-color='orange';">删除</button> 
			<button stlye="color='white';background-color='orange';">确定</button> 
		</td>
	</tr>
<%
	} 
%>
</table>
</body>
</html>