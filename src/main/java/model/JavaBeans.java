package model;


public class JavaBeans {
	private int id;
	private int team_number;
	private String team_name;
	private double fish1;
	private double fish2;
	private double fish3;
	private double total_cm;
	private int pe_point;
	private int ppe_point;
	private int pcf_point;
	private int pm_point;
	private int total_point;
	private int id_team;
	
	
	public JavaBeans() {
		super();
		
	}
	
	
	
	public int getId_team() {
		return id_team;
	}



	public void setId_team(int id_team) {
		this.id_team = id_team;
	}



	public JavaBeans(int id, int team_number, String team_name, double fish1, double fish2, double fish3,
			double total_cm, int pe_point, int ppe_point, int pcf_point, int pm_point, int total_point, int id_team) {
		super();
		this.id = id;
		this.team_number = team_number;
		this.team_name = team_name;
		this.fish1 = fish1;
		this.fish2 = fish2;
		this.fish3 = fish3;
		this.total_cm = total_cm;
		this.pe_point = pe_point;
		this.ppe_point = ppe_point;
		this.pcf_point = pcf_point;
		this.pm_point = pm_point;
		this.total_point = total_point;
		this.id_team = id_team;
	}



	public JavaBeans(int id, int team_number, String team_name, double fish1, double fish2, double fish3, double total_cm, int pe_point,
			int ppe_point, int pcf_point, int pm_point, int total_point
			) {
		super();
		this.id = id;
		this.team_number = team_number;
		this.team_name = team_name;
		this.fish1 = fish1;
		this.fish2 = fish2;
		this.fish3 = fish3;
		this.total_cm = total_cm;
		this.pe_point = pe_point;
		this.ppe_point = ppe_point;
		this.pcf_point = pcf_point;
		this.pm_point = pm_point;
		this.total_point = total_point;
		
		
	}
	
	public JavaBeans(int team_number, String team_name, double fish1, double fish2, double fish3, double total_cm, int pe_point,
			int ppe_point, int pcf_point, int pm_point, int total_point
			) {
		super();
		this.team_number = team_number;
		this.team_name = team_name;
		this.fish1 = fish1;
		this.fish2 = fish2;
		this.fish3 = fish3;
		this.total_cm = total_cm;
		this.pe_point = pe_point;
		this.ppe_point = ppe_point;
		this.pcf_point = pcf_point;
		this.pm_point = pm_point;
		this.total_point = total_point;
		
	}

	public JavaBeans(int team_number, String team_name) {
		super();
		this.team_number = team_number;
		this.team_name = team_name;
	}
	
	public JavaBeans(int id, int team_number, String team_name) {
		super();
		this.id = id;
		this.team_number = team_number;
		this.team_name = team_name;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTeam_number() {
		return team_number;
	}

	public void setTeam_number(int team_number) {
		this.team_number = team_number;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public double getFish1() {
		return fish1;
	}

	public void setFish1(double fish1) {
		this.fish1 = fish1;
	}

	public double getFish2() {
		return fish2;
	}

	public void setFish2(double fish2) {
		this.fish2 = fish2;
	}

	public double getFish3() {
		return fish3;
	}

	public void setFish3(double fish3) {
		this.fish3 = fish3;
	}

	public double getTotal_cm() {
		return total_cm;
	}

	public void setTotal_cm(double total_cm) {
		this.total_cm = total_cm;
	}

	public int getPe_point() {
		return pe_point;
	}

	public void setPe_point(int pe_point) {
		this.pe_point = pe_point;
	}

	public int getPpe_point() {
		return ppe_point;
	}

	public void setPpe_point(int ppe_point) {
		this.ppe_point = ppe_point;
	}

	public int getPcf_point() {
		return pcf_point;
	}

	public void setPcf_point(int pcf_point) {
		this.pcf_point = pcf_point;
	}

	public int getPm_point() {
		return pm_point;
	}

	public void setPm_point(int pm_point) {
		this.pm_point = pm_point;
	}

	public int getTotal_point() {
		return total_point;
	}

	public void setTotal_point(int total_point) {
		this.total_point = total_point;
	}



	
	
}
