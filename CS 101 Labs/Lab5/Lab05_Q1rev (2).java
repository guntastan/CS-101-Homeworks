/**
 * trial
 */
import java.util.Scanner;

 public class Lab05_Q1rev {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter city plan string: ");
        String cityPlan = scan.nextLine();
        int cityPlanLength = cityPlan.length();
        int Max = 0;  
        
        for (int i = 0 ; i <= cityPlanLength-1; i++){
            char cityDigits = cityPlan.charAt(i);
            if (Character.isDigit(cityDigits)){
                int a = Integer.parseInt(String.valueOf(cityDigits));
                if (a >= Max){
                    Max = a;
                }
            }
            else{
                if (cityDigits == 'B'){
                    i++;
                }
            }
            
        }
        
        for (int floor = Max ; floor > 0; floor--){                                    
            for(int j = 0; j <= cityPlanLength-1; j++){
                char cityChar = cityPlan.charAt(j);                
                if (Character.isDigit(cityChar)){
                    int cityDigit = Character.getNumericValue(cityChar);
                    if (floor <= cityDigit){
                        System.out.print("*");
                    
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    //int strindex = cityPlan.indexOf('B'); 
                    char citychar1 = cityPlan.charAt(j+1); 
                    int cityDigit1 = Character.getNumericValue(citychar1);
                    int heightBridge = Character.getNumericValue(cityPlan.charAt(j-1));
                    if (floor == heightBridge){
                        for(int g  = 1; g<=cityDigit1; g++){                        
                            System.out.print("*");                        
                        }
                    }
                    else{
                        for(int g  = 1; g<=cityDigit1; g++){                        
                            System.out.print(" ");                        
                        }                        
                    }
                    j++;                                                                                                  
                }                                        
            }
            System.out.println();
        }
        scan.close();
    }    
}