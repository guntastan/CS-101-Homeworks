/**
 * Hackathon
 */
public class Hackathon {

    private static int MAX_NO_OF_PROJECTS = 6;
    private static int INDICATOR_COUNT = 4;
    private static double[] INDICATOR_WEIGHTS = {10.0/100,25.0/100,30.0/100,35.0/100};

   
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
        String finale = "\nInitial Table\n***********************************************************************\n"+String.format("%-15s%-15s%-15s%-15s%-11s", "Project ID","Indicator 1","Indicator 2","Indicator 3","Indicator 4\n");
        for (int i = 0; i<projectCount;i++){
            finale = finale + projects[i].getRawValues()+"\n";
        }
        finale += "\nModified Table\n***********************************************************************\n"+ String.format("%-15s%-15s%-15s%-15s%-11s", "Project ID","Indicator 1","Indicator 2","Indicator 3","Indicator 4\n");
        for (int i = 0;i<projectCount;i++){
            finale += projects[i].getModiValues()+"\n";
        }
        finale = finale + "\nFinal Table\n************************************************************************************************************************\n"+ String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-11s", "Project ID","Indicator 1","Indicator 2","Indicator 3","Indicator 4","Weighted Mean","Segment","Credibility\n");
        for (int i = 0;i<projectCount;i++){
            finale = finale + projects[i].getFinalValues()+"\n";
        }
        return finale;
    }    
    
    public static void main(String[] args) {
        Hackathon Hackathon = new Hackathon();               
        Project p1 = new Project("A1",100,240,15,26);
        Hackathon.addProject(p1);
        Project p2 = new Project("A2", 20, 407, 13, 11);
        Hackathon.addProject(p2);
        Project p3 = new Project("A3", 100, 281, 13, 39);
        Hackathon.addProject(p3);
        Project p4 = new Project("A4", 80, 1264, 4, 38);
        Hackathon.addProject(p4);
        Project p5 = new Project("A5", 20, 1020, 12, 11);
        Hackathon.addProject(p5);
        Project p6 = new Project("A6", 100, 1162, 17, 34);
        Hackathon.addProject(p6);
        System.out.println(Hackathon);

    }
}