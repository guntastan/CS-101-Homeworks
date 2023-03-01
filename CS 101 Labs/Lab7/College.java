/**
 * College
 */
public class College {

    private String collegeName;
    private String teamName;
    private String state;
    private int alumniCount=0;

    public College(String acollegeName, String aTeamName, String aState){
        this.collegeName = acollegeName;
        this.teamName = aTeamName;
        this.state = aState;
    }
    public void changeTeamName(String changeName){
        this.teamName = changeName;
    }
    public void addAlumni(){
        this.alumniCount ++;
    }
    public  String toString(){
        return "************************************************************" +
        "\n" + "College Name: " + this.collegeName + "\n" + "College Team Name:" + this.teamName+ "\n"+
        "State  " + this.state + "\n" + "Number of graduates (alumni): " + this.alumniCount;
    }
    public String getCollegeName(){
        return this.collegeName;
    }
    public String getTeamName(){
        return this.teamName;
    }
    public String getState(){
        return this.state;
    }
    public int getAlumniCount(){
        return this.alumniCount;
    }
}