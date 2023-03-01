/**
 *
 */
import java.util.Scanner;

 public class Lab04_Q3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input n: ");
        int inputNum = scan.nextInt();
        System.out.println("Now input " + inputNum + " positive integers:");
        int startingPoint = 1;        
        int min = 2147483647;
        int max = -2147483648;
        double sum  = 0;
        
        while (startingPoint <= inputNum){
            int userValue = scan.nextInt();
            sum = sum + userValue;  
            
                      
            if (userValue <= min || userValue>=max){
                min = userValue;
                max = userValue;
            }
            else if (userValue >= max){                
                max = userValue;
            }
            
            startingPoint++;
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + sum/inputNum);
        scan.close();
    }
}