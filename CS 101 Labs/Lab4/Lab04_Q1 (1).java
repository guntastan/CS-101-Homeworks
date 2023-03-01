/**
 * Lab04_Q1
 */
import java.util.Scanner;

 public class Lab04_Q1 {

    public static void main(String[] args) {
        int FIB0 = 0;
        int FIB1 = 1;
        int startPoint = 2;               
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input n: ");
        int wantedFibonNum = scan.nextInt();        
        if (wantedFibonNum == FIB0 || wantedFibonNum == FIB1){
            System.out.println("Fib("+wantedFibonNum+") is " + wantedFibonNum);
        }        
        else{  
            int FibonPrinted = 0 ;                     
            while(startPoint <= wantedFibonNum){
                FibonPrinted = FIB0 + FIB1;
                FIB0 = FIB1;
                FIB1 = FibonPrinted;
                startPoint++;                
            }
            System.out.println("Fib("+wantedFibonNum+") is " + FibonPrinted);            
        }
        scan.close();    
    }
}