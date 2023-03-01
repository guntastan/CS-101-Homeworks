/**
 * trial
 */
import java.util.Scanner;

 public class Lab05_Q1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter city plan string: ");
        String cityPlan = scan.nextLine();
        int cityPlanLength = cityPlan.length();
        int Max = 0;  
        
        for (int i = 0 ; i <= cityPlanLength-1; i++){
            char cityDigits = cityPlan.charAt(i);
            int a = Integer.parseInt(String.valueOf(cityDigits));
            if (a >= Max){
                Max = a;
            }
        }
        
        for (int floor = Max ; floor > 0; floor--){                                    
            for(int j = 0; j <= cityPlanLength-1; j++ ){
                char cityChar = cityPlan.charAt(j);
                int cityDigit = Character.getNumericValue(cityChar);
                if (floor <= cityDigit){
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(" ");
                }                
            }
            System.out.println();
        }
        scan.close();
    }    
}