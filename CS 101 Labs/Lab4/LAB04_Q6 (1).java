/**
 *
 */
import java.util.Scanner;

 public class LAB04_Q6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input n: ");
        int n = scan.nextInt();
        System.out.print("Please input m: ");
        int m = scan.nextInt();

        System.out.print("Please input a positive integer: ");
        int input = scan.nextInt();
        double sum = input;
        int min = 2147483647;
        int max = -2147483648;
        int counter = 0;
        
        while (input >= n && input <= m){            
            System.out.print("Please input a positive integer: ");
            int inputs = scan.nextInt();
            input = inputs;
            if (input > n && input < m){                
                sum = sum + inputs;
                if (input < min){
                    min = input;
                }
                else if (input > max){
                    max = input;
                }            
                counter++;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " +sum/counter);
        scan.close();       
        
    }
}