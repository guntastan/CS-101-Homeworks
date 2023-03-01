

/**
 * Project
 */
public class Project {

    static int INITIAL = 0;
    static int MODIFIED = 1;
    static int FINAL = 2;
    
    private String ID;
    private double finalScore;
    private String segment = "?";
    private String credibility = "?";
    private int[] rawScores ;
    private int[] modifiedScores ;    
    private Hackathon hackathon;  
    
    

    public Project(String anID, int i1,int i2,int i3,int i4){
        this.ID = anID;
        this.rawScores = new int[]{i1,i2,i3,i4};
        calModifiedScores();
        calcWeightAvg();
        calcSegment();
        calcCredibility();            
    }
    public Hackathon getHackathon(){
        return this.hackathon;
    }
    public void setHackathon(Hackathon anHackathon){
        this.hackathon = anHackathon;
    }    
    public void calModifiedScores(){        
        this.modifiedScores = rawScores.clone();
        if (modifiedScores[1]<=500){
            modifiedScores[1]=20;
        }
        else if (modifiedScores[1]<=1000){
            modifiedScores[1]=80;
        }
        else{
            modifiedScores[1]= 100;
        }
        if (modifiedScores[2]<=6){
            modifiedScores[2]=100;
        }
        else if (modifiedScores[2]<=12){
            modifiedScores[2]=80;
        }
        else{
            modifiedScores[2]=20;
        }
        if (modifiedScores[3]<=10){
            modifiedScores[3]=20;
        }
        else if (modifiedScores[3]<=15){
            modifiedScores[3]=80;
        }
        else{
            modifiedScores[3]=100;
        }
    }
    public void calcWeightAvg(){
        this.finalScore = (((modifiedScores[0]*10.0)/100) + ((modifiedScores[1]*25.0)/100) + ((modifiedScores[2]*30.0)/100) + ((modifiedScores[3]*35.0)/100));
    }
    public void calcSegment(){
        if (this.finalScore==100){
            this.segment = "A+";
        }
        else if (this.finalScore>=90){
            this.segment = "A";
        }
        else if (this.finalScore>=75){
            this.segment = "B";
        }
        else if (this.finalScore>=60){
            this.segment = "C";
        }
        else if (this.finalScore>=40){
            this.segment = "D";
        }
    }
    public void calcCredibility(){
        if (this.segment.equals("A+")){
            this.credibility = "Perfect";
        }
        else if (this.segment.equals("A")){
            this.credibility = "Very Good";
        }
        else if (this.segment.equals("B")){
            this.credibility = "Good";
        }
        else if (this.segment.equals("C")){
            this.credibility = "Considerable";
        }
        else if (this.segment.equals("D")){
            this.credibility = "Not appropriate";
        }
    }
    public String toString(){
        String row1 = String.format("%-15s%-15s%-15s%-15s%-11s", this.ID,this.rawScores[0],this.rawScores[1],this.rawScores[2],this.rawScores[3]);
        String row2 = String.format("%-15s%-15s%-15s%-15s%-11s", this.ID,this.modifiedScores[0],this.modifiedScores[1],this.modifiedScores[2],this.modifiedScores[3]);
        String row3 = String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-11s",this.ID,this.modifiedScores[0],this.modifiedScores[1],this.modifiedScores[2],this.modifiedScores[3],this.finalScore,this.segment,this.credibility);
        return "\nInitial Table\n***********************************************************************\n" + 
        String.format("%-15s%-15s%-15s%-15s%-11s", "Project ID","Indicator 1","Indicator 2","Indicator 3","Indicator 4\n")
        + row1 + "\nModified Table\n***********************************************************************\n"+ String.format("%-15s%-15s%-15s%-15s%-11s", "Project ID","Indicator 1","Indicator 2","Indicator 3","Indicator 4\n")+
        row2+ "\nFinal Table\n************************************************************************************************************************\n"+ String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-11s", "Project ID","Indicator 1","Indicator 2","Indicator 3","Indicator 4","Weighted Mean","Segment","Credibility\n")+
        row3;
    }  
    public String getRawValues(){
        String rowOne = String.format("%-15s%-15s%-15s%-15s%-11s", this.ID,this.rawScores[0],this.rawScores[1],this.rawScores[2],this.rawScores[3]);
        return rowOne;
    }
    public String getModiValues(){
        String rowTwo =  String.format("%-15s%-15s%-15s%-15s%-11s", this.ID,this.modifiedScores[0],this.modifiedScores[1],this.modifiedScores[2],this.modifiedScores[3]);
        return rowTwo;
    }
    public String getFinalValues(){
        String rowThree = String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-11s",this.ID,this.modifiedScores[0],this.modifiedScores[1],this.modifiedScores[2],this.modifiedScores[3],this.finalScore,this.segment,this.credibility);
        return rowThree;
    }
    

}