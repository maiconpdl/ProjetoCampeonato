<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.JavaBeans" %>
<%@ page import="java.util.ArrayList" %>
<%
	ArrayList<JavaBeans> list = (ArrayList<JavaBeans>) request.getAttribute("stage");
	ArrayList<JavaBeans> list2 = (ArrayList<JavaBeans>) request.getAttribute("team");

%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Campeonato</title>
<link rel="stylesheet" href="css/style.css">
<link rel="icon" href="../../images/favicon.ico">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
	<h1>1° Etapa</h1>
	
		<!-- Button trigger modal -->
	<button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
	  Adicionar equipe
	</button>
	
	<table id="table" class="table">
		<thead>
			<tr>
				<th scope="col">CLASSIFICAÇÃO</th>
				<th scope="col">N° EQUIPE</th>
				<th scope="col">NOME EQUIPE</th>
				<th scope="col">PEIXE 1</th>
				<th scope="col">PEIXE 2</th>
				<th scope="col">PEIXE 3</th>
				<th scope="col">TOTAL CM</th>
				<th scope="col">P.E</th>
				<th scope="col">P.P.E</th>
				<th scope="col">P.C.F</th>
				<th scope="col">P.M</th>
				<th scope="col">TOTAL PONTOS</th>
				<th scope="col">AÇÃO</th>
			</tr>
		</thead>
		<tbody>
		
			<%for (int i = 0; i < list.size(); i++){ %>
				<%if (i==0){ %>
						
				<tr style="background:gold;">
					<%}else if(i==1){ %>
					<tr style="background:silver;">
					<%}else if(i==2){ %>
					<tr style="background:#CD7F32;">
					<%}else{ %>
				<tr>
					<%} %>
					<td><%=i+1+"°" %></td>
					<td><%=list.get(i).getTeam_number()%></td>
					<td><%=list.get(i).getTeam_name()%></td>
					<%if (list.get(i).getFish1()==0){ %>
					<td>-</td>
					<%}else{ %>
					<td><%=list.get(i).getFish1()%></td>
					<%} %>
					<%if (list.get(i).getFish2()==0){ %>
					<td>-</td>
					<%}else{ %>
					<td><%=list.get(i).getFish2()%></td>
					<%} %>
					<%if (list.get(i).getFish3()==0){ %>
					<td>-</td>
					<%}else{ %>
					<td><%=list.get(i).getFish3()%></td>
					<%} %>
					<%if (list.get(i).getTotal_cm()==0){ %>
					<td>-</td>
					<%}else{ %>
					<td><%=list.get(i).getTotal_cm()%></td>
					<%} %>
					<%if (list.get(i).getPe_point()==0){ %>
					<td>-</td>
					<%}else{ %>
					<td><%=list.get(i).getPe_point()%></td>
					<%} %>
					<%if (list.get(i).getPpe_point()==0){ %>
					<td>-</td>
					<%}else{ %>
					<td><%=list.get(i).getPpe_point()%></td>
					<%} %>
					<%if (list.get(i).getPcf_point()==0){ %>
					<td>-</td>
					<%}else{ %>
					<td><%=list.get(i).getPcf_point()%></td>
					<%} %>
					<%if (list.get(i).getPm_point()==0){ %>
					<td>-</td>
					<%}else{ %>
					<td><%=list.get(i).getPm_point()%></td>
					<%} %>
					<%if (list.get(i).getTotal_point()==0){ %>
					<td>-</td>
					<%}else{ %>
					<td><%=list.get(i).getTotal_point()%></td>
					<%} %>
					<td><a href="selectStageTeam?id=<%=list.get(i).getId()%>" type="button" class="btn btn-primary">
						  Adicionar peixe
						</a>
			
					</td>
				
				
				</tr>
				
			<%} %>
		</tbody>
	</table>
	
	


<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h1 class="modal-title fs-5" id="exampleModalLabel">Modal title</h1>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <form action="insertStageTeam">
      <div class="modal-body">
      	<select class="form-select" id="selectStageTeam" aria-label="Default select example">
      	
		  	<option selected>Open this select menu</option>
      		<%for (int i = 0; i < list2.size(); i++){ %>      		
		  		<option value="<%=list2.get(i).getId()%>"><%=list2.get(i).getTeam_name()%></option>
			<%} %>
		
		</select>
      </div>
      <input type="text" name="id" id="inputTeamNumber"/>
      <input type="text" name="team_name" id="inputTeamName"/>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">Save changes</button>
      </div>
      </form>
    </div>
  </div>
</div>
	

	
	
	
	
	<link rel="stylesheet" href="/css/result.css">
	<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
	<script src="scripts/stage.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
</body>
</html>