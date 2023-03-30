package studio7;

public class HockeyPlayer {

	private String name;
	private int jerseyNumber;
	private boolean shootR; 
	private boolean handR;
	private int goals;
	private int assists;
	private int games;

	public HockeyPlayer (String name, int jerseyNumber, boolean shootR, boolean handR,int goals, int assists, int games) {
	this.name = name;
	this.jerseyNumber = jerseyNumber;
	this.shootR = shootR;
	this.handR = handR;
	this.goals = goals;
	this.assists = assists;
	this.games = games;
	
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public boolean isShootR() {
		return shootR;
	}

	public void setShootR(boolean shootR) {
		this.shootR = shootR;
	}

	public boolean isHandR() {
		return handR;
	}

	public void setHandR(boolean handR) {
		this.handR = handR;
	}

	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}

	public int getGames() {
		return games;
	}

	public void setGames(int games) {
		this.games = games;
	}
	public int Points() {
		int points = this.assists + this.goals;
		return points;
	}
	
	public static void main(String[] args) {
		HockeyPlayer practice = new HockeyPlayer("Doug", 1, true, true, 5, 5, 5);
	}
	
	public String toString () {
		return "";
	}
	}

