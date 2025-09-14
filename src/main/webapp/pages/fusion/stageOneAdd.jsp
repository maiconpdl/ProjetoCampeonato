<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.JavaBeans" %>
<%@ page import="java.util.ArrayList" %>
<%
	ArrayList<JavaBeans> list = (ArrayList<JavaBeans>) request.getAttribute("stage");

%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Agenda de contatos</title>
<link rel="icon" href="imagens/favicon.png">
<link rel="stylesheet" href="css/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
<div class="container" style="width: 30%;">
	<h1>1° Etapa</h1>
	

	<form action="updateStageTeam">
		
					
				
					<input type="text" class="form-control" name="id" hidden readonly value="<%out.print(request.getAttribute("id"));%>"><br/>
				
					
						<input type="text" class="form-control" name="team_number" readonly value="<%out.print(request.getAttribute("team_number"));%>"><br/>
					
						<input type="text" class="form-control" name="team_name" readonly value="<%out.print(request.getAttribute("team_name"));%>"><br/>
					
						<input type="text" class="form-control" name="fish1" value="<%out.print(request.getAttribute("fish1"));%>"><br/>
					
						<input type="text" class="form-control" name="fish2" value="<%out.print(request.getAttribute("fish2"));%>"><br/>
					
						<input type="text" class="form-control" name="fish3" value="<%out.print(request.getAttribute("fish3"));%>"><br/>
					
						<input type="text" class="form-control" name="total_cm" value="<%out.print(request.getAttribute("total_cm"));%>"><br/>
					
						<input type="text" class="form-control" name="pe_point" value="<%out.print(request.getAttribute("pe_point"));%>"><br/>
					
						<input type="text" class="form-control" name="ppe_point" value="<%out.print(request.getAttribute("ppe_point"));%>"><br/>
					
						<input type="text" class="form-control" name="pcf_point" value="<%out.print(request.getAttribute("pcf_point"));%>"><br/>
					
						<input type="text" class="form-control" name="pm_point" value="<%out.print(request.getAttribute("pm_point"));%>"><br/>
					
						<input type="text" class="form-control" name="total_point" hidden readonly  value="<%out.print(request.getAttribute("total_point"));%>"><br/>
					
			
	
		  <button type="submit" class="btn btn-primary">Salvar</button>
	</form>
</div>
	<script src="scripts/confirmador.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
</body>
</html>