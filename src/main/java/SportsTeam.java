public class SportsTeam {

/*Create  5 instance variables :a String representing the Team’s name, an int representing the number of games played, 
an int representing the games won and an int representing the games lost and an int representing the number of ties.*/
    private String teamName;
    private int plays;
    private int wins;
    private int losses;
    private int ties;

  //   public SportsTeam(String teamName, int plays, int wins, int losses, int ties) {
  //       this.teamName = teamName;
  //       this.plays = plays;
  //       this.wins = wins;
  //       this.losses = losses;
  //      this.ties =ties;
  // }
   public SportsTeam(String teamName) {
        this.teamName = teamName;
        this.plays = 0;
        this.wins = 0;
        this.losses = 0;
       this.ties =0;
  }

	public String getName() {
		return teamName;
	}

	public void setName(String teamName) {
		this.teamName = teamName;
	}

	public int getPlays() {
		return plays;
	}

	public void setPlays(int plays) {
		this.plays = plays;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public int getTies() {
		return ties;
	}

	public void setTies(int ties) {
		this.ties = ties;
	}
  
  
}