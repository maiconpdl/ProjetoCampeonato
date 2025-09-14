<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.JavaBeans" %>
<%@ page import="java.util.ArrayList" %>
<%
	ArrayList<JavaBeans> list = (ArrayList<JavaBeans>) request.getAttribute("team");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>

	<button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
  		Nova Equipe
	</button>

	<table id="table" class="table table-striped table-hover">
		<thead>
			<tr>
				<th scope="col">N° EQUIPE</th>
				<th scope="col">NOME EQUIPE</th>

			</tr>
		</thead>
		<tbody>
			<%if (list != null){%>
			<%for (int i = 0; i < list.size(); i++){ %>
				<tr>
			
					<td><%=list.get(i).getTeam_number()%></td>
					<td><%=list.get(i).getTeam_name()%></td>				
				
				</tr>
			<%} %>
			<%} %>
		</tbody>
	</table>
	
	

	<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h1 class="modal-title fs-5" id="exampleModalLabel">Cadastro de equipe</h1>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
      	<form action="insertTeam">
	      	<div class="form-floating mb-3">
	 			<input type="text" name="team_number" class="form-control" id="floatingInput">
	 			<label for="floatingInput">Número da equipe</label>
			</div>
			<div class="form-floating mb-3">
	 			<input type="text" name="team_name" class="form-control" id="floatingInput">
	 			<label for="floatingInput">Nome da equipe</label>
			</div>
	      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
        <button type="submit" class="btn btn-primary">Salvar</button>
      </div>
      	</form>
    </div>
  </div>
</div>
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>

</body>
</html>