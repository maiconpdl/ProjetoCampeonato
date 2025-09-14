package model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO {
	/* Módulo de conexão **/
	// Parâmetros de conexão

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/championship?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "57027366";

	// Método de conexão

	private Connection conect() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	// teste de conexão
	
	  public void testeConexao() { 
		  try { Connection con = conect();
	  		System.out.println(con); 
	  		con.close(); 
		  } catch (Exception e) {
			  System.out.println(e); 
		  } 
	  }
	 

	/** CRUD CREATE **/
	  
	  public void insertStageTeam(JavaBeans stageTeam) {
			String create = "insert into stage1 (team_number,team_name,id_team) values(?,?,?)";
			try {
				// Abrir conexão com BD
				Connection con = conect();

				// Preparar a query para execução no BD
				PreparedStatement pst = con.prepareStatement(create);

				// Substituir os parâmetros (?) pelo conteúdo JavaBeans
				
				pst.setInt(1, stageTeam.getTeam_number());
				pst.setString(2, stageTeam.getTeam_name());
				pst.setInt(3, stageTeam.getId_team());

				// Executa query
				pst.executeUpdate();

				// Encerrar conexão com BD
				con.close();
			} catch (Exception e) {

				System.out.println(e);
			}
		}	  
	  
	  
	public void insertTeam(JavaBeans team) {
		String create = "insert into teams (team_number,team_name) values(?,?)";
		try {
			// Abrir conexão com BD
			Connection con = conect();

			// Preparar a query para execução no BD
			PreparedStatement pst = con.prepareStatement(create);

			// Substituir os parâmetros (?) pelo conteúdo JavaBeans
			
			pst.setInt(1, team.getTeam_number());
			pst.setString(2, team.getTeam_name());

			// Executa query
			pst.executeUpdate();

			// Encerrar conexão com BD
			con.close();
		} catch (Exception e) {

			System.out.println(e);
			System.out.println("Número de equipe já adicionado!");
		}
	}

	/** CRUD READ **/
	public ArrayList<JavaBeans> selectStage() {
		// Criando objeto para acesso à classe JavaBeans
		ArrayList<JavaBeans> stage = new ArrayList<>();
		String read = "select * from stage1 order by total_point desc";

		try {
			Connection con = conect();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();

			// O laço abaixo executa enquanto houver contatos
			while (rs.next()) {
				// Variáveis de apoio que recebem os dados do banco
				int id = rs.getInt(1);
				int team_number = rs.getInt(2);
				String team_name = rs.getString(3);
				double fish1 = rs.getDouble(4);
				double fish2 = rs.getDouble(5);
				double fish3 = rs.getDouble(6);
				double total_cm = rs.getDouble(7);
				int pe_point = rs.getInt(8);
				int ppe_point = rs.getInt(9);
				int pcf_point = rs.getInt(10);
				int pm_point = rs.getInt(11);
				int total_point = (rs.getInt(8)+rs.getInt(9)+rs.getInt(10))-rs.getInt(11);
//				int total_point = rs.getInt(12);
				

				// Armazena dados no vetor dinâmico
				stage.add(new JavaBeans(id,team_number,team_name,fish1,fish2,fish3,total_cm,pe_point,ppe_point,pcf_point,pm_point,total_point));
			}
			con.close();
			return stage;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	
	public ArrayList<JavaBeans> selectTeams() {
		// Criando objeto para acesso à classe JavaBeans
		ArrayList<JavaBeans> team = new ArrayList<>();
		String read = "select * from teams order by team_number";

		try {
			Connection con = conect();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();

			// O laço abaixo executa enquanto houver contatos
			while (rs.next()) {
				// Variáveis de apoio que recebem os dados do banco
				int id = rs.getInt(1);
				int team_number = rs.getInt(2);
				String team_name = rs.getString(3);
				

				// Armazena dados no vetor dinâmico
				team.add(new JavaBeans(id,team_number,team_name));
			}
			con.close();
			return team;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	
	public void selectTeam(JavaBeans team, int id) {
		// Criando objeto para acesso à classe JavaBeans
		
		String read = "select * from teams where id = ?";

		try {
			Connection con = conect();
			PreparedStatement pst = con.prepareStatement(read);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();

			// O laço abaixo executa enquanto houver contatos
			while (rs.next()) {
				// Variáveis de apoio que recebem os dados do banco
				team.setId(rs.getInt(1));
				team.setTeam_number(rs.getInt(2));
				team.setTeam_name(rs.getString(3));
				team.setId_team(id);
				
			}
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
	}

	/** CRUD UPDATE **/
	// Selecionar contato
	public void selectStageTeam(JavaBeans team) {
		String read2 = "select * from stage1 where id = ?";
		try {
			Connection con = conect();
			PreparedStatement pst = con.prepareStatement(read2);
			pst.setInt(1, team.getId());
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				// Setar variáveis JavaBeans
				team.setId(rs.getInt(1));
				team.setTeam_number(rs.getInt(2));
				team.setTeam_name(rs.getString(3));
				team.setFish1(rs.getDouble(4));
				team.setFish2(rs.getDouble(5));
				team.setFish3(rs.getDouble(6));
				team.setTotal_cm(rs.getDouble(7));
				team.setPe_point(rs.getInt(8));
				team.setPpe_point(rs.getInt(9));
				team.setPcf_point(rs.getInt(10));
				team.setPm_point(rs.getInt(11));
				team.setTotal_point(rs.getInt(12));
				
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//Edita o contato
	public void updateStageTeam(JavaBeans stageTeam) {
		
		String create = "update stage1 set team_number=?,team_name=?,fish1=?, fish2=?, fish3=?, total_cm=?, pe_point=?, ppe_point=?, pcf_point=?, pm_point=?, total_point=? where id=?";
		try {
			Connection con = conect();
			PreparedStatement pst = con.prepareStatement(create);
			pst.setInt(1, stageTeam.getTeam_number());
			pst.setString(2, stageTeam.getTeam_name());
			pst.setDouble(3, stageTeam.getFish1());
			pst.setDouble(4, stageTeam.getFish2());
			pst.setDouble(5, stageTeam.getFish3());
			pst.setDouble(6, stageTeam.getTotal_cm());
			pst.setInt(7, stageTeam.getPe_point());
			pst.setInt(8, stageTeam.getPpe_point());
			pst.setInt(9, stageTeam.getPcf_point());
			pst.setInt(10, stageTeam.getPm_point());
			pst.setInt(11, (stageTeam.getPe_point()+stageTeam.getPpe_point()+stageTeam.getPcf_point())-stageTeam.getPm_point());
			pst.setInt(12, stageTeam.getId());
			
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	 
	/** CRUD DELETE **/
	/*public void deletarContato(JavaBeans contato) {
		String delete = "delete from contatos where idcont=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(delete);
			pst.setString(1, contato.getIdcont());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}*/

}
