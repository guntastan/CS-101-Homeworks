/**
 * Lab02_Q2
 */
import java.util.Scanner;

public class Lab02_Q2 {

    public static void main(String[] args) {
        
                
               
        Scanner scan_q2 = new Scanner(System.in);
        System.out.print("Enter the odometer reading of the car in kilometers: ");
        double input_kilometres = scan_q2.nextDouble();

       
       //Constants(Percentages of costs and cost of maintenance)
       final int OIL_CHANGE = 30;
       final int BATTERY = 15;
       final int BRAKES = 25;
       final int TIRE = 13;
       final int OTHER = 17;
       final double COST_OF_MAINTENANCE = 0.1; 
       
               
        //Variables(Results depending on constants and total kilometer)
        double cost_maintenance = input_kilometres * COST_OF_MAINTENANCE;
        double oil_change_cost = (OIL_CHANGE * cost_maintenance)/100;
        double battery_cost = (BATTERY * cost_maintenance)/100;
        double brakes_cost = (BRAKES * cost_maintenance)/100;
        double tire_cost = (TIRE * cost_maintenance)/100;
        double other_cost = (OTHER * cost_maintenance)/100;
        

        String firstLine = String.format("*Oil Change %11%%d%23.2f*",OIL_CHANGE, oil_change_cost);
        String secondLine = String.format("*Battery %14%%d%23.2f*",BATTERY, battery_cost);
        String thirdLine = String.format("*Brakes %15%%d%23.2f*",BRAKES, brakes_cost);
        String fourthLine = String.format("*Tire %17%%d%23.2f*",TIRE, tire_cost);
        String fifthLine = String.format("*Other %16%%d%23.2f*",OTHER, other_cost);
        String sixthLine = String.format("* %25s%21.2f*","TOTAL",cost_maintenance);
        
        System.out.println("*************************************************");
        System.out.println("***** Maintenance Cost Distribution Table *******");
        System.out.println("*************************************************");   
        System.out.println(firstLine);
        System.out.println(secondLine);
        System.out.println(thirdLine);
        System.out.println(fourthLine);
        System.out.println(fifthLine);
        System.out.println(sixthLine);
        System.out.println("*************************************************"); 
       
        scan_q2.close();
    }
}