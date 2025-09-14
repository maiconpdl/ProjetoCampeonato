package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import model.DAO;
import model.JavaBeans;

@WebServlet(urlPatterns = { "/Controller", "/main", "/teams", "/insertTeam", "/selectStageTeam", "/updateStageTeam", "/insertStageTeam" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	JavaBeans jbeans = new JavaBeans();

	public Controller() {
		super();

	}
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();
		if (action.equals("/main")) {
			stage(request, response);
		} else if (action.equals("/teams")) {
			team(request, response);
		} else if (action.equals("/insertTeam")) {
			insertTeam(request, response);
		} else if (action.equals("/selectStageTeam")) {
			selectStageTeam(request, response);
		} else if (action.equals("/updateStageTeam")) {
			updateStageTeam(request, response);
		} else if (action.equals("/insertStageTeam")) {
			insertStageTeam(request, response);
		} else{
			response.sendRedirect("index.html");
		}
		// teste de conexão
		 //dao.testeConexao();
	}

	// Listar contatos
	protected void stage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Criando objeto que receberá os dados JavaBeans
		ArrayList<JavaBeans> list = dao.selectStage();
		ArrayList<JavaBeans> list2 = dao.selectTeams();

		// Encaminhar a lista ao documento agenda.jsp
		request.setAttribute("stage", list);
		request.setAttribute("team", list2);		
		RequestDispatcher rd = request.getRequestDispatcher("/pages/fusion/stage1.jsp");
		rd.forward(request, response);
		
	}
	
	protected void team(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Criando objeto que receberá os dados JavaBeans
		ArrayList<JavaBeans> list = dao.selectTeams();

		// Encaminhar a lista ao documento agenda.jsp
		request.setAttribute("team", list);
		RequestDispatcher rd = request.getRequestDispatcher("/pages/teams/teams.jsp");
		rd.forward(request, response);
		
	}
	
	protected void insertTeam(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		jbeans.setTeam_number(Integer.parseInt(request.getParameter("team_number")));
		jbeans.setTeam_name(request.getParameter("team_name"));

		dao.insertTeam(jbeans);
		
		response.sendRedirect("teams");
		
	}
	
	protected void insertStageTeam(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		dao.selectTeam(jbeans, Integer.parseInt(request.getParameter("id")));
		
		

		dao.insertStageTeam(jbeans);
		
		response.sendRedirect("main");
		
	}
	
	protected void selectStageTeam(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		
		
		jbeans.setId(id);
		dao.selectStageTeam(jbeans);
		
		request.setAttribute("id", jbeans.getId());
		request.setAttribute("team_number", jbeans.getTeam_number());
		request.setAttribute("team_name", jbeans.getTeam_name());
		request.setAttribute("fish1", jbeans.getFish1());
		request.setAttribute("fish2", jbeans.getFish2());
		request.setAttribute("fish3", jbeans.getFish3());
		request.setAttribute("total_cm", jbeans.getTotal_cm());
		request.setAttribute("pe_point", jbeans.getPe_point());
		request.setAttribute("ppe_point", jbeans.getPpe_point());
		request.setAttribute("pcf_point", jbeans.getPcf_point());
		request.setAttribute("pm_point", jbeans.getPm_point());
		request.setAttribute("total_point", jbeans.getTotal_point());

		RequestDispatcher rd = request.getRequestDispatcher("/pages/fusion/stageOneAdd.jsp");
		rd.forward(request, response);
	}
	
	protected void updateStageTeam(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		jbeans.setId(Integer.parseInt(request.getParameter("id")));
		jbeans.setTeam_number(Integer.parseInt(request.getParameter("team_number")));
		jbeans.setTeam_name(request.getParameter("team_name"));
		jbeans.setFish1(Double.parseDouble(request.getParameter("fish1")));
		jbeans.setFish2(Double.parseDouble(request.getParameter("fish2")));
		jbeans.setFish3(Double.parseDouble(request.getParameter("fish3")));
		jbeans.setTotal_cm(Double.parseDouble(request.getParameter("total_cm")));
		jbeans.setPe_point(Integer.parseInt(request.getParameter("pe_point")));
		jbeans.setPpe_point(Integer.parseInt(request.getParameter("ppe_point")));
		jbeans.setPcf_point(Integer.parseInt(request.getParameter("pcf_point")));
		jbeans.setPm_point(Integer.parseInt(request.getParameter("pm_point")));
		//jbeans.setTotal_point(Integer.parseInt(request.getParameter("pe_point")) + Integer.parseInt(request.getParameter("ppe_point")) + Integer.parseInt(request.getParameter("pcf_point")) + Integer.parseInt(request.getParameter("pm_point")));
		//jbeans.setTotal_point(Integer.parseInt(request.getParameter("total_point")));
		
		dao.updateStageTeam(jbeans);
		response.sendRedirect("main");
	}

}
