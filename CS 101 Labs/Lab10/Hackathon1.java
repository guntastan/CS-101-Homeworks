import java.util.ArrayList;

/**
 * Hackathon
 */
public class Hackathon {

    private static int MAX_NO_OF_PROJECTS = 6;
    private static int INDICATOR_COUNT = 4;
    private static double[] INDICATOR_WEIGHTS = {10.0/100,15.0/100,20.0/100,20.0/100,30.0/100,5.0/100};
    private static int MAX_INVESTABLE_AMOUNT = 4000000;

   
    private int projectCount;
    private Project[] projects = new Project[9];  
      

    public Hackathon (){
        this.projectCount = 0;
        this.projects = new Project [MAX_NO_OF_PROJECTS];              
      
    }
    public int getMaxNoOfProjects(){
        return MAX_NO_OF_PROJECTS;
    } 
    public int getIndicatorCount(){
        return INDICATOR_COUNT;
    }
    public double[] getIndicatorWeights(){
        return INDICATOR_WEIGHTS;
    }
    public void addProject(Project project){
        projects[projectCount] = project;
        projectCount++;
        project.setHackathon(this);    
    }
    public String toString(){ 
        String finale="" ;     
        finale = finale + "\nFinal Table\n************************************************************************************************************************\n"+ String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-11s", "Project ID","Indicator 1","Indicator 2","Indicator 3","Indicator 4","Indicator 5","Indicator 6","Weighted Mean","Segment","Credibility\n");
        for (int i = 0;i<projectCount;i++){
            finale = finale + projects[i].getFinalValues()+"\n";
        }
        return finale;
    }

    public void makeDecision(Hackathon aHackathon){
        String [][] investedOnes = new String [8][5];
        double [] capitals = new double [6];
        double [] goals = new double[6];
        double [] paybacks = new double[6];
        double [] durations = new double [6];
        double finalCapital = 0;
        double ratioedPayback = 0;
        int maxGoal =0;
        int maxDur=0;
        for (int a =0; a<6;a++){
            investedOnes [a][0] = aHackathon.projects[a].getID();
            investedOnes [a][1]= ""+aHackathon.projects[a].getCapital();
            investedOnes [a][2]= ""+aHackathon.projects[a].getPayback();
            investedOnes [a][3]= ""+aHackathon.projects[a].getGoal();
            investedOnes [a][4] = "" + aHackathon.projects[a].getDuration();

        }
        investedOnes[7][0] = "TOTAL/MAX";
        investedOnes[7][1]= ""+finalCapital;
        investedOnes[7][2] = ""+ ratioedPayback;
        investedOnes[7][3] = ""+maxGoal;
        investedOnes [7][4]= ""+maxDur;
        for (int a =0; a<capitals.length;a++){
            finalCapital = finalCapital + aHackathon.projects[a].getCapital();
            capitals[a] = aHackathon.projects[a].getCapital();
        }
        for (int a = 0; a<paybacks.length;a++){
            paybacks[a] = aHackathon.projects[a].getPayback();
            ratioedPayback = ratioedPayback + (capitals[a]*paybacks[a]);
        }
        for (int a = 0;a<goals.length;a++){
            goals[a]= aHackathon.projects[a].getGoal();
            if (aHackathon.projects[a].getGoal()>maxGoal){
                maxGoal=aHackathon.projects[a].getGoal();
            }
        }
        for (int a =0; a<durations.length;a++){
            durations[a] = aHackathon.projects[a].getDuration();
            System.out.printf("%-15s",investedOnes[a][1]);
            System.out.printf("%-15s",investedOnes[a][2]);
            System.out.printf("%-15s",investedOnes[a][3]);
            System.out.printf("%-15s",investedOnes[a][4]);
            System.out.println();
            if (aHackathon.projects[a].getDuration()>0){
                maxDur = aHackathon.projects[a].getDuration();
            }
        }
        System.out.println("***************************************************************************\n");
        System.out.printf("%-15s",investedOnes[7][0]);
        System.out.printf("%-15s",investedOnes[7][1]);
        System.out.printf("%-15s",investedOnes[7][2]);
        System.out.printf("%-15s",investedOnes[7][3]);
        
        String [] lettergrade = {"A+","A","B","C"};
        ArrayList <Project> invested = new ArrayList<Project>();
        double curBud = MAX_INVESTABLE_AMOUNT;
         

        for (int i = 0; i<lettergrade.length;i++){
            for (int j = 0; j<projects.length;j++){
                double projectBudget = projects[j].getCapital()*projects[j].getPayback();
                if (projects[j].getSegment().equals(lettergrade[i])&& projectBudget<curBud){
                    curBud = curBud-projectBudget;
                    invested.add(projects[j]);
                }
            }
        }
        System.out.println("\nTASK 2\n We cannot invest in all projects, we have to discard some of them\n");
        for (int a = 0;a<invested.size();a++){
            invested.get(a).getSegment();
        }
        System.out.println("Invested Amount: " + (curBud));
        System.out.println("Expected Payback Amount: "+ratioedPayback );
        System.out.println("Rest of the Budget: " +(MAX_INVESTABLE_AMOUNT-curBud));
        System.out.println("Payback period will start at most " +maxDur+ " months later.");
        System.out.println("We will support at most " +maxGoal+ " sustainable goals.");
        
    }
    
    public static void main(String[] args) {
        Hackathon Hackathon = new Hackathon();               
        Project p1 = new Project("A1",100,240,15,26,67991,12);
        Hackathon.addProject(p1);
        Project p2 = new Project("A2", 20, 407, 13, 11,860657,1);
        Hackathon.addProject(p2);
        Project p3 = new Project("A3", 100, 281, 13, 39,193696,9);
        Hackathon.addProject(p3);
        Project p4 = new Project("A4", 80, 1264, 4, 38,382208,7);
        Hackathon.addProject(p4);
        Project p5 = new Project("A5", 20, 1020, 12, 11,958624,1);
        Hackathon.addProject(p5);
        Project p6 = new Project("A6", 100, 1162, 17, 34,1140003,6);
        Hackathon.addProject(p6);        
        Hackathon restHackathon = new Hackathon();
        Project p7 = new Project("A7", 80, 772, 15, 31, 75924, 10);
        restHackathon.addProject(p7);
        Project p8 = new Project("A8", 80, 753, 8, 25,914601,9);
        restHackathon.addProject(p8);
        Project p9 = new Project("A9", 80, 1201, 1, 25, 1259662, 11);
        restHackathon.addProject(p9);
        

        for (int i =0;i<Hackathon.projectCount;i++){
            for (int j =0;j<restHackathon.projectCount;j++){
                if ((!Hackathon.projects[i].getCredibility().equals("INVEST"))&&restHackathon.projects[j].getCredibility().equals("INVEST")){
                    Project temp = Hackathon.projects[i];
                    Hackathon.projects[i]= restHackathon.projects[j];
                    restHackathon.projects[j] = temp;                
                }

            }       
        
        } 
        System.out.println(Hackathon);        
        System.out.println(restHackathon);
        Hackathon.makeDecision(Hackathon);
                     

    }      
}
