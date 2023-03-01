package lab7_revised;

public class Lab7_Rev3_Main {
    public static void main(String[] args) {
        College college = new College("University of North Carolina at Chapel Hill", "Tar Heels", "North Carolina");
        Player_Rev3 player = new Player_Rev3("Michael Jordan", "SG", "CHI", 23, college);
        player.retire();
        System.out.println(player.getCollege());
        /* 
        ************************************************************
        College Name: University of North Carolina at Chapel Hill
        College Team Name: Tar Heels
        State: North Carolina
        Number of graduates (alumni): 1
        ************************************************************
        */

        college.changeTeamName("North Carolina Tar Heels");
        System.out.println(player.getCollege());

        /*
        ************************************************************
        College Name: University of North Carolina at Chapel Hill
        College Team Name: North Carolina Tar Heels
        State: North Carolina
        Number of graduates (alumni): 1
        ************************************************************        
        */

        Player_Rev3 player2 = new Player_Rev3("Reggie Bullock", "SF", "DAL", 25, college);
        System.out.println(player2.getCollege());
        /*
        ************************************************************
        College Name: University of North Carolina at Chapel Hill
        College Team Name: North Carolina Tar Heels
        State: North Carolina
        Number of graduates (alumni): 2
        ************************************************************
        */

    }
}
