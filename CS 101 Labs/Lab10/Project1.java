

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
    
    

    public Project(String anID, int i1,int i2,int i3,int i4,int i5,int i6){
        this.ID = anID;
        this.rawScores = new int[]{i1,i2,i3,i4,i5,i6};
        calModifiedScores();
        calcWeightAvg();
        calcSegment();
        calcCredibility();            
    }
    public Hackathon getHackathon(){
        return this.hackathon;
    }
    public void setHackathon(Hackathon hackathonModi){
        this.hackathon = hackathonModi;
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
        if (modifiedScores[4]<= 1000000){
            modifiedScores[4]= 100;
        }
        else if (modifiedScores[4]<=1500000){
            modifiedScores[4]= 80;
        }
        else{
            modifiedScores[4]=20;
        }
        if(modifiedScores[5]<=2){
            modifiedScores[5]=1;            
        }
        else if (modifiedScores[5]<=5){
            modifiedScores[5]=20;
        }
        else if (modifiedScores[5]<=10){
            modifiedScores[5]=80;
        }
        else{
            modifiedScores[5]=100;
        }
    }
    public void calcWeightAvg(){
        this.finalScore = (((modifiedScores[0]*10.0)/100) + ((modifiedScores[1]*15.0)/100) + ((modifiedScores[2]*20.0)/100) + ((modifiedScores[3]*20.0)/100) + ((modifiedScores[4]*30.0/100))+ ((modifiedScores[5]*5.0/100)));
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
        if (this.segment.equals("A+")&& (modifiedScores[4]==100||modifiedScores[4]==80||modifiedScores[4]==20)&&(modifiedScores[5]==100||modifiedScores[5]==80||modifiedScores[5]==20)){
            this.credibility = "INVEST";
        }
        else if (this.segment.equals("A")&&(modifiedScores[4]==100||modifiedScores[4]==80||modifiedScores[4]==20)&&(modifiedScores[5]==100||modifiedScores[5]==80||modifiedScores[5]==20)){
            this.credibility = "INVEST";
        }
        else if (this.segment.equals("B")&&(modifiedScores[4]==100||modifiedScores[4]==80)&&(modifiedScores[5]==100||modifiedScores[5]==80)){
            this.credibility = "INVEST";
        }
        else if (this.segment.equals("C")&&(modifiedScores[4]==100)&&(modifiedScores[5]==100)){
            this.credibility = "INVEST";
        }
        else{
            this.credibility = "DO NOT INVEST";
        }
    
        if(modifiedScores[5]<=2){
            modifiedScores[5]=1;
            this.credibility = "REMOVED";
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
        String rowThree = String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-11s",this.ID,this.modifiedScores[0],this.modifiedScores[1],this.modifiedScores[2],this.modifiedScores[3],this.modifiedScores[4],this.modifiedScores[5],this.finalScore,this.segment,this.credibility);
        return rowThree;
    }
    public String getCredibility(){
        return this.credibility;
    }
    public String getID(){
        return this.ID;
    }
    public double getCapital(){
        return rawScores[4]*1.0;
    }
    public double getPayback(){
        return rawScores[3];
    }
    public int getGoal(){
        return rawScores[5];
    }
    public int getDuration(){
        return rawScores[2];
    }
    public String getSegment(){
        return this.segment;
    }
    
}