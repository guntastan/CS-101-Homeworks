/**
 * Player
 */
public class Player_Rev3 {

    private static final double efficiencyScore = 0;
    static int count = 0;
    static int allCount = 0;
    private int id;
    private String name;
    private String position;
    private String team;
    private int rosterNumber;
    private boolean isActive;
    private int gamesPlayed = 1;
    private double points = 0;
    private double assists = 0;
    private double rebounds = 0;
    private double turnovers = 0;
    private double pointsPerGame;
    private double assistsPerGame;
    private double reboundsPerGame;
    private double turnoversPerGame;
    private College college = null;
        
    public Player_Rev3(String name, String position, String team, int rosterNumber, Object College){ 
        register();           
        this.name = name;
        this.position = position;
        this.team = team;
        this.rosterNumber = rosterNumber;
        this.id = allCount;
        this.college = (College) College;
        if (this.college ==null){

        }
        else{
            ((College)college).addAlumni();
        }                                 
    }
    public void setName(String aName){
        this.name = aName;
    }
    public void setPosition(String aPosition){
        if (aPosition.equals("SF")|| aPosition.equals("PF")|| aPosition.equals("SG")||aPosition.equals("PG")||aPosition.equals("C")){
            this.position = aPosition;
        }
        else{
            System.out.println("Invalid position.");
        }
    }
    public void setRosterNumber(int aRosterNum){
        this.rosterNumber = aRosterNum;
    }
    public void register(){
        count++;
        allCount++;
        this.isActive = true;                                  
    }
    public void remove(){
        count--;        
    }
    public void retire(){        
        this.isActive = false;
    }
    public void transfer(String aTeam){
        if (!this.team.equals(aTeam)){
            this.team = aTeam;
        }
        else{
            System.out.println("Error");
        }
    }
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    public String getPosition (){
        return this.position;
    }
    public String getTeam(String team){
        return this.team;
    }
    public String getisActive(){
        if (this.isActive){
            return "Active";
        }
        else{
            return "Passive";
        }        
    }
    public int getRosterNum (){
        return this.rosterNumber;
    }
    public boolean isBeforeThan(Object Player){
        if (this.name.compareTo(((Player) Player).getName()) <0){
            return true;
        }
        else{
            return false; 
        }
    }
    public void recordGame(int p, int a, int r, int t){        
        this.points += p;
        this.pointsPerGame = this.points/this.gamesPlayed;
        this.assists += a;
        this.assistsPerGame = this.assists/this.gamesPlayed;
        this.rebounds += r;
        this.reboundsPerGame = this.rebounds/this.gamesPlayed;
        this.turnovers += t;
        this.turnoversPerGame = this.turnovers/this.gamesPlayed;
        this.gamesPlayed++;
    }
    public double getEfficiency(){
        double efficiencyScore = 1.0*pointsPerGame + 0.7*assistsPerGame + 0.7*reboundsPerGame - 0.9*turnoversPerGame;
        return efficiencyScore;
    }
    public boolean isMoreEfficient(Object Player){
        if (efficiencyScore > ((Player)Player).getEfficiency()){
            return true;
        }
        else{
            return false;
        }
    }
    public String toString(){
        return "**************************************************\n" + "Player ID: " + this.id + "\n" + "Player Name: "  + this.name
        + "\n" + "Player Position: " + this.position + "\n" + "Current Team: " + this.team + "\n" + "Jersey Number: " + this.rosterNumber
        + "\n" + "--------------------------------------------------" + "\n" +"Stats: " + "\n" + "PRG: " + String.format("%.2f", pointsPerGame) + 
        "\n" + "APG: "+ String.format("%.2f", assistsPerGame)+ "\n" + "RPG: " + String.format("%.2f", reboundsPerGame)+ "\n"  + 
        "TPG: " + String.format("%.2f", turnoversPerGame) + "\n" + "Efficiency: " + String.format("%.2f",getEfficiency())
        + "\n" + "--------------------------------------------------" + "\n" + "Retiement Status: " + getisActive() + " among "
        + allCount + " player(s).";
    }   
    public String getCollege(){
        if (this.college == null){
            return "College is null";
        }
        else{
            return ((College)college).toString();
        }
    }

}