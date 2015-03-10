<%@page import="java.util.List"%>
<%@page import="kennedy.Aluno"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Gerenciador de Alunos</title>
</head>
<body>

	<h1>Lista de Alunos</h1>



	<%
		//Scriptlet
		// Problema se resolve na execução... 
		List<Aluno>Alunos = (List<Aluno>)request.getAttribute("Aluno");
		
		// For que imprimi todos os alunos cadastrados
		for (Aluno A : Alunos) {
			out.print(A.getNome());
			out.print("<br>");
			out.print(A.getCPF());
			out.print("<br>");
			out.print(A.getRG());
			out.print("<br>");
			out.print(A.getSexo());
			out.print("<br>");
			out.print(A.getEstado());
			out.print("<br>");
			out.print(" -----------------------------------");
			out.print("<br>");


		}
	%>


</body>
</html>